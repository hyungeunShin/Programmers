package com.programmers.level0.p12;

import java.util.Arrays;

public class 머쓱이보다키큰사람 {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {149, 180, 192, 170}, 167));
        System.out.println(solution(new int[] {180, 120, 140}, 190));
    }

    public static int solution(int[] array, int height) {
        return (int) Arrays.stream(array).filter(n -> n > height).count();
    }
}
