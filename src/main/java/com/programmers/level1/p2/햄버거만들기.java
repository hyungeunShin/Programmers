package com.programmers.level1.p2;

import java.util.Stack;

public class 햄버거만들기 {
    public static void main(String[] args) {
        System.out.println((solution(new int[] {2, 1, 1, 2, 3, 1, 2, 3, 1})));
        System.out.println(solution(new int[] {1, 3, 2, 1, 2, 1, 3, 1, 2}));


        System.out.println(solution(new int[] {1, 2, 1, 2, 3, 1, 3, 1}));   //2
        System.out.println(solution(new int[] {2, 1, 1, 2, 1, 2, 1, 2, 3, 1, 3, 1, 3, 1, 2, 3, 1})); //4
        System.out.println(solution(new int[] {1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1})); //3
        System.out.println(solution(new int[] {1, 1, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1})); //5
        System.out.println(solution(new int[] {1, 2, 3, 2, 1, 2, 3, 1, 1})); //1
    }

    public static int solution(int[] ingredient) {
        int answer = 0;
//        StringBuilder sb = new StringBuilder();
//        for(int i : ingredient) {
//            sb.append(i);
//            if(sb.length() > 3 && sb.substring(sb.length() - 4, sb.length()).contains("1231")) {
//                answer++;
//                sb.delete(sb.length() - 4, sb.length());
//            }
//        }

        Stack<Integer> stack = new Stack<>();
        for(int i : ingredient) {
            stack.push(i);

            if(stack.size() >= 4) {
                if(stack.get(stack.size() - 4) == 1
                    && stack.get(stack.size() - 3) == 2
                    && stack.get(stack.size() - 2) == 3
                    && stack.get(stack.size() - 1) == 1) {
                    answer++;
                    stack.pop();
                    stack.pop();
                    stack.pop();
                    stack.pop();
                }
            }
        }

        return answer;
    }
}
