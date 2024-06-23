package com.programmers.level0.p12;

import java.util.Arrays;

public class 배열2배만들기 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[] {1, 2, 3, 4, 5})));
        System.out.println(Arrays.toString(solution(new int[] {1, 2, 100, -99, 1, 2, 3})));
    }

    public static int[] solution(int[] numbers) {
        return Arrays.stream(numbers).map(n -> n * 2).toArray();
    }
}
