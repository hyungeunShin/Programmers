package com.programmers.level0_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class 배열만들기4 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 4, 2, 5, 3})));
    }

    public static int[] solution(int[] arr) {
//        int i = 0;
//        List<Integer> list = new ArrayList<>();
//
//        while(i < arr.length) {
//            if (list.isEmpty()) {
//                list.add(arr[i]);
//                i++;
//            } else if (list.get(list.size() - 1) >= arr[i]) {
//                list.remove(list.size() - 1);
//            } else {
//                list.add(arr[i]);
//                i++;
//            }
//        }
//
//        return list.stream().mapToInt(n -> n).toArray();
        Stack<Integer> stack = new Stack<>();
        int i = 0;

        while(i < arr.length) {
            if(stack.empty() || stack.peek() < arr[i]) {
                stack.push(arr[i]);
                i++;
            } else if(stack.peek() >= arr[i]) {
                stack.pop();
            }
        }
        return stack.stream().mapToInt(n -> n).toArray();
    }
}
