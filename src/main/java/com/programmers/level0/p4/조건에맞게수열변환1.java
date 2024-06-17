package com.programmers.level0.p4;

import java.util.Arrays;

public class 조건에맞게수열변환1 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 100, 99, 98})));
    }

    public static int[] solution(int[] arr) {
        return Arrays.stream(arr)
                .map(n -> {
                    if(n >= 50 && n % 2 == 0) {
                        return n / 2;
                    } else if(n < 50 && n % 2 != 0) {
                        return n * 2;
                    } else {
                        return n;
                    }
                })
                .toArray();
    }
}
