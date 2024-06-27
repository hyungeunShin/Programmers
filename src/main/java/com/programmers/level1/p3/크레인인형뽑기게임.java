package com.programmers.level1.p3;

import java.util.Arrays;
import java.util.Stack;

public class 크레인인형뽑기게임 {
    public static void main(String[] args) {
        int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] moves = {1,5,3,5,1,2,1,4};

        System.out.println(solution(board, moves));
    }

    public static int solution(int[][] board, int[] moves) {
        /*
        0 0 0 0 0
        0 0 1 0 3
        0 2 5 0 1
        4 2 4 4 2
        3 5 1 3 1

        1 5 3 5 1 2 1 4

        4 3 1 1 3 2   4
        */
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for(int m : moves) {
            for(int i = 0; i < board.length; i++) {
                if(board[i][m - 1] != 0) {
                    if(!stack.isEmpty() && stack.peek() == board[i][m - 1]) {
                        stack.pop();
                        answer += 2;
                    } else {
                        stack.push(board[i][m - 1]);
                    }
                    System.out.printf("board[%d][%d] : %d\n", i, m - 1, board[i][m-1]);
                    board[i][m - 1] = 0;
                    Arrays.stream(board).forEach(row -> {
                        Arrays.stream(row).forEach(value -> System.out.print(value + " "));
                        System.out.println();
                    });
                    break;
                }
            }
        }
        System.out.println(stack);

        return answer;
    }
}
