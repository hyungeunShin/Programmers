package com.programmers.level0.p2;

import java.util.stream.IntStream;

public class 등차수열의특정한항만더하기 {
    public static void main(String[] args) {
        System.out.println(solution(3, 4, new boolean[] {true, false, false, true, true}));
        System.out.println(solution(7, 1, new boolean[] {false, false, false, true, false, false, false}));
    }

    public static int solution(int a, int d, boolean[] included) {
//        int sum = 0;
//
//        for(int i = 0; i < included.length; i++) {
//            if(included[i]) {
//                sum += a + d * i;
//            }
//        }
//
//        return sum;
        return IntStream.range(0, included.length)
                        .map(idx -> included[idx] ? a + (idx * d) : 0)
                        .sum();
    }
}
