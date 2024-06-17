package com.programmers.level0.p6;

import java.util.Arrays;

public class 배열길이에따른연산 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{49, 12, 100, 276, 33}, 27)));
        System.out.println(Arrays.toString(solution(new int[]{444, 555, 666, 777}, 100)));
    }

    public static int[] solution(int[] arr, int n) {
//        if(arr.length % 2 == 0) {
//            for(int i = 0; i < arr.length; i++) {
//                if(i % 2 != 0) {
//                    arr[i] += n;
//                }
//            }
//        } else {
//            for(int i = 0; i < arr.length; i++) {
//                if(i % 2 == 0) {
//                    arr[i] += n;
//                }
//            }
//        }
//        return arr;

        for(int idx = arr.length % 2 == 0 ? 1 : 0; idx < arr.length; idx+=2) {
            arr[idx] += n;
        }

        return arr;
    }
}
