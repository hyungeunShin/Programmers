package com.programmers.level0.p9;

public class 안전지대 {
    public static void main(String[] args) {
        int[][] board1 = {{0,0,0,0,0}, {0,0,0,0,0}, {0,0,0,0,0}, {0,0,1,0,0}, {0,0,0,0,0}};
        int[][] board2 = {{0,0,0,0,0}, {0,0,0,0,0}, {0,0,0,0,0}, {0,0,1,1,0}, {0,0,0,0,0}};
        int[][] board3 = {{1,1,1,1,1}, {1,1,1,1,1}, {1,1,1,1,1}, {1,1,1,1,1}, {1,1,1,1,1}};

        System.out.println(solution(board1));
        System.out.println(solution(board2));
        System.out.println(solution(board3));
    }

    public static int solution(int[][] board) {
        int[] arr1 = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] arr2 = {-1, 0, 1, -1, 1, -1, 0, 1};

        int[][] boom = new int[board.length][board.length];
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board.length; j++) {

                if(board[i][j] == 1) {
                    boom[i][j] = 1;
                    for(int k = 0; k < 8; k++) {
                        int x = arr1[k] + i;
                        int y = arr2[k] + j;
                        if(x >= 0 && y >= 0 && x < board.length && y < board.length) {
                            boom[x][y] = 1;
                        }
                    }
                }
            }
        }

        int answer = 0;
        for(int i = 0; i < boom.length; i++) {
            for(int j = 0; j < boom.length; j++) {
                if(boom[i][j] == 0) {
                    answer++;
                }
            }
        }
        return answer;
    }
}
