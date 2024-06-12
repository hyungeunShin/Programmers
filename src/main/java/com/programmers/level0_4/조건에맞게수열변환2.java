package com.programmers.level0_4;

import java.util.Arrays;

public class 조건에맞게수열변환2 {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {1, 2, 3, 100, 99, 98}));
    }

    public static int solution(int[] arr) {
        int[] before = Arrays.copyOf(arr, arr.length);
        int answer = 0;

        while(true) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr[i] /= 2;
                } else if (arr[i] < 50 && arr[i] % 2 != 0) {
                    arr[i] = arr[i] * 2 + 1;
                }
            }

            if(Arrays.equals(arr, before)) {
                return answer;
            }

            before = Arrays.copyOf(arr, arr.length);

            answer++;
        }
    }
}
