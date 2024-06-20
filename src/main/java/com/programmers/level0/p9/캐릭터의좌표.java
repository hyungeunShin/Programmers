package com.programmers.level0.p9;

import java.util.Arrays;

public class 캐릭터의좌표 {
    public static void main(String[] args) {
        String[] keyInput1 = {"left", "right", "up", "right", "right"};
        int[] board1 = {11, 11};

        String[] keyInput2 = {"down", "down", "down", "down", "down"};
        int[] board2 = {7, 9};

        System.out.println(Arrays.toString(solution(keyInput1, board1)));
        System.out.println(Arrays.toString(solution(keyInput2, board2)));
    }

    public static int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0, 0};

        int width = board[0] / 2;
        int height = board[1] / 2;
        for(String s : keyinput) {
            if("left".equals(s) && answer[0] > width * -1) {
                answer[0]--;
            } else if("right".equals(s) && answer[0] < width) {
                answer[0]++;
            } else if("up".equals(s) && answer[1] < height) {
                answer[1]++;
            } else if("down".equals(s) && answer[1] > height * -1) {
                answer[1]--;
            }
        }

        return answer;
    }
}
