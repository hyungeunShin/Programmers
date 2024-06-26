package com.programmers.level0.p11;

import java.util.Arrays;

public class 배열자르기 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[] {1, 2, 3, 4, 5}, 1, 3)));
        System.out.println(Arrays.toString(solution(new int[] {1, 3, 5}, 1, 2)));
    }

    public static int[] solution(int[] numbers, int num1, int num2) {
        return Arrays.copyOfRange(numbers, num1, num2 + 1);
    }
}
