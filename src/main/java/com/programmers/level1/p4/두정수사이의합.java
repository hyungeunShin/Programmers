package com.programmers.level1.p4;

import java.util.stream.LongStream;

public class 두정수사이의합 {
    public static void main(String[] args) {
        System.out.println(solution(3, 5));
        System.out.println(solution(3, 3));
        System.out.println(solution(5, 3));
    }

    public static long solution(int a, int b) {
        long start = Math.min(a, b);
        long end = Math.max(a, b);

//        return LongStream.rangeClosed(start, end).sum();
        return (end - start + 1) * (start + end) / 2;
    }
}
