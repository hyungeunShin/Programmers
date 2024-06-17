package com.programmers.level0.p7;

import java.util.Arrays;

public class 특별한이차원배열1 {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(solution(3)));
        System.out.println(Arrays.deepToString(solution(6)));
        System.out.println(Arrays.deepToString(solution(1)));
    }

    public static int[][] solution(int n) {
        int[][] answer = new int[n][n];

//        for(int i = 0; i < n; i++) {
//            for(int j = 0; j < n; j++) {
//                if(i == j) {
//                    answer[i][j] = 1;
//                } else {
//                    answer[i][j] = 0;
//                }
//            }
//        }

        for(int i = 0 ; i < n ; i++) {
            answer[i][i] = 1;
        }

        return answer;
    }
}
