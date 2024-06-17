package com.programmers.level0.p7;

import java.util.Arrays;

public class 정수를나선형으로배치 {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(solution(4)));
        System.out.println(Arrays.deepToString(solution(5)));
    }

    public static int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int num = 1;
        int row = 0;
        int col = 0;
        int lastRow = n - 1;
        int lastCol = n - 1;

        while(num <= n * n) {
            for(int i = col; i <= lastCol; i++) {
                answer[row][i] = num++;
            }
            for(int i = row + 1; i <= lastRow; i++) {
                answer[i][lastCol] = num++;
            }
            for(int i = lastCol - 1; i >= col; i--) {
                answer[lastRow][i] = num++;
            }
            for(int i = lastRow - 1; i > row; i--) {
                answer[i][col] = num++;
            }
            row++;
            col++;
            lastRow--;
            lastCol--;
        }
        return answer;

//        int[][] answer = new int[n][n];
//        int num = 1;
//        int x = 0, y = 0;
//        int[] dx = {0, 1, 0, -1};
//        int[] dy = {1, 0, -1, 0};
//        int direction = 0;
//
//        while(num <= n * n) {
//            answer[x][y] = num++;
//
//            int nx = x + dx[direction];
//            int ny = y + dy[direction];
//
//            if(nx < 0 || nx >= n || ny < 0 || ny >= n || answer[nx][ny] != 0) {
//                direction = (direction + 1) % 4;
//                nx = x + dx[direction];
//                ny = y + dy[direction];
//            }
//            x = nx;
//            y = ny;
//        }
//
//        return answer;
    }
}
