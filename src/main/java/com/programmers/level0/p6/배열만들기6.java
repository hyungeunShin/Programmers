package com.programmers.level0.p6;

import java.util.Arrays;
import java.util.Stack;

public class 배열만들기6 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[] {0, 1, 1, 1, 0})));
        System.out.println(Arrays.toString(solution(new int[] {0, 1, 0, 1, 0})));
        System.out.println(Arrays.toString(solution(new int[] {0, 1, 1, 0})));
    }

    public static int[] solution(int[] arr) {
//        List<Integer> list = new ArrayList<>();
//        for(int n : arr) {
//            if(list.isEmpty()) {
//                list.add(n);
//                continue;
//            }
//
//            if(list.get(list.size() - 1) == n) {
//                list.remove(list.size() - 1);
//            } else {
//                list.add(n);
//            }
//        }
//        return list.isEmpty() ? new int[] {-1} : list.stream().mapToInt(Integer::intValue).toArray();

        Stack<Integer> stack = new Stack<>();

        for(int n : arr) {
            if(!stack.isEmpty() && n == stack.peek()) {
                stack.pop();
            } else {
                stack.push(n);
            }
        }

        return stack.isEmpty() ? new int[] {-1} : stack.stream().mapToInt(i -> i).toArray();
    }
}
