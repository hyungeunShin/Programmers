package com.programmers.level0_3;

import java.util.Arrays;
import java.util.stream.IntStream;

public class 배열만들기1 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(10, 3)));
        System.out.println(Arrays.toString(solution(15, 5)));
    }

    public static int[] solution(int n, int k) {
        return IntStream.rangeClosed(1, n)
                        .filter(i -> i % k == 0)
                        .toArray();
    }
}
