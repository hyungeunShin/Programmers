package com.programmers.level0.p6;

import java.util.Arrays;
import java.util.Stack;

public class 빈배열추가삭제하기 {
    public static void main(String[] args) {
        int[] arr = {3,2,4,1,3};
        boolean[] flag = {true, false, true, false, false};

        System.out.println(Arrays.toString(solution(arr, flag)));
    }

    public static int[] solution(int[] arr, boolean[] flag) {
//        String answer = "";
//
//        for(int i = 0; i < arr.length; i++) {
//            if(flag[i]) {
//                answer += String.valueOf(arr[i]).repeat(arr[i] * 2);
//            } else {
//                answer = answer.substring(0, answer.length() - arr[i]);
//            }
//        }
//
//        return Arrays.stream(answer.split("")).mapToInt(Integer::parseInt).toArray();

        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < flag.length; i++) {
            if(flag[i]) {
                for(int j = 0; j < arr[i] * 2; j++) {
                    stack.push(arr[i]);
                }
            } else {
                for(int j = 0; j < arr[i]; j++) {
                    stack.pop();
                }
            }
        }

        return stack.stream().mapToInt(Integer::intValue).toArray();
    }
}
