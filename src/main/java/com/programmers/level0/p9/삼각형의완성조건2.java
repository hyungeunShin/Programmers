package com.programmers.level0.p9;

import java.util.stream.IntStream;

public class 삼각형의완성조건2 {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {1, 2}));
        System.out.println(solution(new int[] {3, 6}));
        System.out.println(solution(new int[] {11, 7}));
    }

    public static int solution(int[] sides) {
//        int max = Math.max(sides[0], sides[1]);
//        int min = Math.min(sides[0], sides[1]);
//
//        int a = (int) IntStream.rangeClosed(max - min + 1, max).count();
//        int b = (int) IntStream.range(max + 1, max + min).count();
//
//        return a + b;

        int min = Math.min(sides[0], sides[1]);
        return min * 2 - 1;
    }
}
