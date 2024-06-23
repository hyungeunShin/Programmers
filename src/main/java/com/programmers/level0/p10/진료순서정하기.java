package com.programmers.level0.p10;

import java.util.Arrays;

public class 진료순서정하기 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[] {3, 76, 24})));
        System.out.println(Arrays.toString(solution(new int[] {1, 2, 3, 4, 5, 6, 7})));
        System.out.println(Arrays.toString(solution(new int[] {30, 10, 23, 6, 100})));
    }

    public static int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];

        for(int i = 0; i < emergency.length; i++) {
            answer[i]++;
            for(int j = 0; j < emergency.length; j++) {
                if(emergency[i] < emergency[j]) {
                    answer[i]++;
                }
            }
        }

        return answer;
    }
}
