package com.programmers.level0.p10;

import java.util.Arrays;

public class 이차원으로만들기 {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(solution(new int[] {1, 2, 3, 4, 5, 6, 7, 8}, 2)));
        System.out.println(Arrays.deepToString(solution(new int[] {100, 95, 2, 4, 5, 6, 18, 33, 948}, 3)));
    }

    public static int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length / n][n];

//        int cnt = 0;
//        for(int i = 0; i < num_list.length / n; i++) {
//            for(int j = 0; j < n; j++, cnt++) {
//                answer[i][j] = num_list[cnt];
//            }
//        }

        for(int i = 0; i < num_list.length; i++) {
            answer[i / n][i % n] = num_list[i];
        }

        return answer;
    }
}
