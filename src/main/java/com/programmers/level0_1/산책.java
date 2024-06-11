package com.programmers.level0_1;

import java.util.Arrays;

public class 산책 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("NSSNEWWN")));
    }

    public static int[] solution(String route) {
        int east = 0;
        int north = 0;
        int[] answer = new int[2];

        for(int i = 0; i < route.length(); i++) {
            switch(route.charAt(i)) {
                case 'N':
                    north++;
                    break;
                case 'S':
                    north--;
                    break;
                case 'E':
                    east++;
                    break;
                case 'W':
                    east--;
                    break;
            }
        }

        answer[0] = east;
        answer[1] = north;
        return answer;
    }
}
