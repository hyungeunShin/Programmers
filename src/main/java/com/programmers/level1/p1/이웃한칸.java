package com.programmers.level1.p1;

public class 이웃한칸 {
    public static void main(String[] args) {
        String[][] board1 = {{"blue", "red", "orange", "red"}, {"red", "red", "blue", "orange"}, {"blue", "orange", "red", "red"}, {"orange", "orange", "red", "blue"}};
        String[][] board2 = {{"yellow", "green", "blue"}, {"blue", "green", "yellow"}, {"yellow", "blue", "blue"}};

        System.out.println(solution(board1, 1, 1));
        System.out.println(solution(board2, 0, 1));
    }

    public static int solution(String[][] board, int h, int w) {
        int answer = 0;

        int[] hh = {0, 0, 1, -1};
        int[] ww = {1, -1, 0, 0};

        String color = board[h][w];
        for(int i = 0; i < 4; i++) {
            int moveH = h + hh[i];
            int moveW = w + ww[i];

            if(moveH >= 0 && moveH < board.length && moveW >= 0 && moveW < board.length) {
                if(color.equals(board[moveH][moveW])) {
                    answer++;
                }
            }
        }

        return answer;
    }
}
