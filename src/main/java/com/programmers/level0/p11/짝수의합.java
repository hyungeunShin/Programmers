package com.programmers.level0.p11;

import java.util.stream.IntStream;

public class 짝수의합 {
    public static void main(String[] args) {
        System.out.println(solution(10));
        System.out.println(solution(4));
    }

    public static int solution(int n) {
        return IntStream.rangeClosed(2, n).filter(i -> i % 2 == 0).sum();
    }
}
