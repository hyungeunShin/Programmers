package com.programmers.level1.p3;

import java.util.Arrays;

public class 평균구하기 {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {1, 2, 3, 4}));
        System.out.println(solution(new int[] {5, 5}));
    }

    public static double solution(int[] arr) {
        return Arrays.stream(arr).average().orElse(0);
    }
}
