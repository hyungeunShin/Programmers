package com.programmers.level0.p8;

import java.util.Arrays;

public class 가까운수 {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {3, 10, 28}, 20));
        System.out.println(solution(new int[] {10, 11, 12}, 13));
    }

    public static int solution(int[] array, int n) {
        Integer[] arr = Arrays.stream(array).boxed().toArray(Integer[]::new);

        Arrays.sort(arr, (o1, o2) -> {
            int a = Math.abs(o1 - n);
            int b = Math.abs(o2 - n);

            if(a == b) {
                return o1 - o2;
            } else {
                return a - b;
            }
        });

        return arr[0];
    }
}
