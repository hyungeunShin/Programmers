package com.programmers.level1.p4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class 같은숫자는싫어 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[] {1, 1, 3, 3, 0, 1, 1})));
        System.out.println(Arrays.toString(solution(new int[] {4,4,4,3,3})));
    }

    public static int[] solution(int []arr) {
//        Stack<Integer> stack = new Stack<>();
//        for(int n : arr) {
//            if(stack.isEmpty() || stack.peek() != n) {
//                stack.push(n);
//            }
//        }
//        return stack.stream().mapToInt(i -> i).toArray();

        int n = -1;
        List<Integer> list = new ArrayList<>();
        for(int i : arr) {
            if(i != n) {
                list.add(i);
                n = i;
            }
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}
