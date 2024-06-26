package com.programmers.level1.p1;

import java.util.Arrays;

public class 과일장수 {
    public static void main(String[] args) {
        System.out.println(solution(3, 4, new int[] {1, 2, 3, 1, 2, 3, 1}));
        System.out.println(solution(4, 3, new int[] {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2}));
    }

    public static int solution(int k, int m, int[] score) {
        Arrays.sort(score);

        int answer = 0;
        for(int i = score.length - m; i >= 0; i -= m) {
            answer += score[i] * m;
        }
        return answer;
    }
}
