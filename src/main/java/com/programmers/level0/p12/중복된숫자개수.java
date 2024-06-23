package com.programmers.level0.p12;

import java.util.Arrays;

public class 중복된숫자개수 {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {1, 1, 2, 3, 4, 5}, 1));
        System.out.println(solution(new int[] {0, 2, 3, 4}, 1));
    }

    public static int solution(int[] array, int n) {
        return (int) Arrays.stream(array).filter(i -> i == n).count();
    }
}
