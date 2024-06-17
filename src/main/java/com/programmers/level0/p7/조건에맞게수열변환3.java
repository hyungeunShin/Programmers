package com.programmers.level0.p7;

import java.util.Arrays;

public class 조건에맞게수열변환3 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 100, 99, 98}, 3)));
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 100, 99, 98}, 2)));
    }

    public static int[] solution(int[] arr, int k) {
//        if(k % 2 == 0) {
//            return Arrays.stream(arr).map(n -> n + k).toArray();
//        } else {
//            return Arrays.stream(arr).map(n -> n * k).toArray();
//        }

        return Arrays.stream(arr)
                     .map(n -> k % 2 == 0 ? n + k : n * k)
                     .toArray();
    }
}
