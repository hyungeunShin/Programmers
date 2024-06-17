package com.programmers.level1.p4;

import java.util.stream.IntStream;

public class 소수찾기 {
    public static void main(String[] args) {
        System.out.println(solution(10));
        System.out.println(solution(5));
    }

    public static int solution(int n) {
        return (int) IntStream.rangeClosed(2, n)
                              .filter(i -> isPrime(i))
                              .count();
    }

    public static boolean isPrime(int n) {
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
