package com.programmers.level1.p3;

import java.util.Arrays;

public class 제일작은수제거 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[] {4, 3, 2, 1})));
        System.out.println(Arrays.toString(solution(new int[] {10})));
    }

    public static int[] solution(int[] arr) {
        if(arr.length <= 1) {
            return new int[] {-1};
        }
        int min = Arrays.stream(arr).min().getAsInt();
        return Arrays.stream(arr).filter(i -> i != min).toArray();
    }
}
