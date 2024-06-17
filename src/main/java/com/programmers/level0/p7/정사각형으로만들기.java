package com.programmers.level0.p7;

import java.util.Arrays;

public class 정사각형으로만들기 {
    public static void main(String[] args) {
        int[][] arr1 = {{572, 22, 37}, {287, 726, 384}, {85, 137, 292}, {487, 13, 876}};
        int[][] arr2 = {{57, 192, 534, 2}, {9, 345, 192, 999}};
        int[][] arr3 = {{1, 2}, {3, 4}};

        System.out.println(Arrays.deepToString(solution(arr1)));
        System.out.println(Arrays.deepToString(solution(arr2)));
        System.out.println(Arrays.deepToString(solution(arr3)));
    }

    public static int[][] solution(int[][] arr) {
        if(arr.length == arr[0].length) {
            return arr;
        } else {
            int max = Math.max(arr.length, arr[0].length);
            int[][] answer = new int[max][max];

            for(int i = 0; i < arr.length; i++) {
//                for(int j = 0; j < arr[i].length; j++) {
//                    answer[i][j] = arr[i][j];
//                }

                System.arraycopy(arr[i], 0, answer[i], 0, arr[i].length);
            }
            return answer;
        }
    }
}
