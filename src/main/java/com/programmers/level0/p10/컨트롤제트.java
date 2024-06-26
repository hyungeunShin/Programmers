package com.programmers.level0.p10;

import java.util.Stack;

public class 컨트롤제트 {
    public static void main(String[] args) {
        System.out.println(solution("1 2 Z 3"));
        System.out.println(solution("10 20 30 40"));
        System.out.println(solution("10 Z 20 Z 1"));
        System.out.println(solution("10 Z 20 Z"));
        System.out.println(solution("-1 -2 -3 Z"));
    }

    public static int solution(String s) {
        int answer = 0;

//        String[] arr = s.split(" ");
//        for(int i = 0; i < arr.length; i++) {
//            if("Z".equals(arr[i])) {
//                answer -= Integer.parseInt(arr[i - 1]);
//            } else {
//                answer += Integer.parseInt(arr[i]);
//            }
//        }

        Stack<Integer> stack = new Stack<>();

        for(String w : s.split(" ")) {
            if("Z".equals(w)) {
                stack.pop();
            } else {
                stack.push(Integer.parseInt(w));
            }
        }
        for(int i : stack) {
            answer += i;
        }

        return answer;
    }
}
