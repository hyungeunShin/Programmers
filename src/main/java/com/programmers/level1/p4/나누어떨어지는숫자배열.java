package com.programmers.level1.p4;

import java.util.Arrays;

public class 나누어떨어지는숫자배열 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{5, 9, 7, 10}, 5)));
        System.out.println(Arrays.toString(solution(new int[]{2, 36, 1, 3}, 1)));
        System.out.println(Arrays.toString(solution(new int[]{3, 2, 6}, 10)));
    }

    public static int[] solution(int[] arr, int divisor) {
        int[] array = Arrays.stream(arr).filter(n -> n % divisor == 0).sorted().toArray();
        return array.length == 0 ? new int[] {-1} : array;
    }
}
