package com.programmers.level1.p2;

import java.util.stream.IntStream;

public class 내적 {
    public static void main(String[] args) {
        int[] a1 = {1, 2, 3, 4};
        int[] b1 = {-3, -1, 0, 2};
        int[] a2 = {-1, 0, 1};
        int[] b2 = {1, 0, -1};
        System.out.println(solution(a1, b1));
        System.out.println(solution(a2, b2));
    }

    public static int solution(int[] a, int[] b) {
        return IntStream.range(0, a.length)
                        .map(i -> a[i] * b[i])
                        .sum();
    }
}
