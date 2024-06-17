package com.programmers.level0.p2;

import java.util.Arrays;

public class 수열과구간쿼리4 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 4, 3};
        int[][] queries = {{0,4,1}, {0,3,2}, {0,3,3}};

        System.out.println(Arrays.toString(solution(arr, queries)));
    }

    public static int[] solution(int[] arr, int[][] queries) {
        for(int[] q : queries) {
            int s = q[0];
            int e = q[1];
            int k = q[2];

            for(int i = s; i <= e; i++) {
                if(i % k == 0) {
                    arr[i]++;
                }
            }
        }

        return arr;
    }
}
