package com.programmers.level0_4;

import java.util.Arrays;

public class 수열과구간쿼리1 {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4};
        int[][] queries = {{0,1}, {1,2}, {2,3}};

        System.out.println(Arrays.toString(solution(arr, queries)));
    }

    public static int[] solution(int[] arr, int[][] queries) {
        for(int[] q : queries) {
            for(int i = q[0]; i <= q[1]; i++) {
                ++arr[i];
            }
        }
        return arr;
    }
}
