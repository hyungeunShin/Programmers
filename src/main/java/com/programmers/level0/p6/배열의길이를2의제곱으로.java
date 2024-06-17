package com.programmers.level0.p6;

import java.util.Arrays;

public class 배열의길이를2의제곱으로 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4, 5, 6})));
        System.out.println(Arrays.toString(solution(new int[]{58, 172, 746, 89})));
    }

    public static int[] solution(int[] arr) {
//        int i = 0;
//        while(Math.pow(2, i) < arr.length) {
//            i++;
//        }
//        return Arrays.copyOf(arr, (int) Math.pow(2, i));

        int length = 1;
        while(length < arr.length) {
            length *= 2;
        }
        return Arrays.copyOf(arr, length);
    }
}
