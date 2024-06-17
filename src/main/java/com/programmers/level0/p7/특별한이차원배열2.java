package com.programmers.level0.p7;

public class 특별한이차원배열2 {
    public static void main(String[] args) {
        System.out.println(solution(new int[][] {{5, 192, 33}, {192, 72, 95}, {33, 95, 999}}));
        System.out.println(solution(new int[][] {{19, 498, 258, 587}, {63, 93, 7, 754}, {258, 7, 1000, 723}, {587, 754, 723, 81}}));
    }

    public static int solution(int[][] arr) {
        boolean flag = true;
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                if (arr[i][j] != arr[j][i]) {
                    flag = false;
                    break;
                }
            }
        }
        return flag ? 1 : 0;
    }
}
