package com.programmers.level0.p10;

import java.util.stream.IntStream;

public class 합성수찾기 {
    public static void main(String[] args) {
        System.out.println(solution(10));
        System.out.println(solution(15));
    }

    public static int solution(int n) {
        return (int) IntStream.rangeClosed(1, n)
            .filter(i -> {
                for(int j = 2; j <= Math.sqrt(i); j++) {
                    if(i % j == 0) {
                        return true;
                    }
                }
                return false;
            })
            .count();
    }
}
