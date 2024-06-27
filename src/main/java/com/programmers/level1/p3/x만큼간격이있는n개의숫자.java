package com.programmers.level1.p3;

import java.util.Arrays;
import java.util.stream.LongStream;

public class x만큼간격이있는n개의숫자 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(2, 5)));
        System.out.println(Arrays.toString(solution(4, 3)));
        System.out.println(Arrays.toString(solution(-4, 2)));
    }

    public static long[] solution(int x, int n) {
        return LongStream.rangeClosed(1, n)
                         .map(i -> x * i)
                         .toArray();
    }
}
