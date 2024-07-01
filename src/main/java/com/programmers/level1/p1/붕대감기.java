package com.programmers.level1.p1;

public class 붕대감기 {
    public static void main(String[] args) {
        int[] bandage = {5, 1, 5};
        int[][] attacks = {{2, 10}, {9, 15}, {10, 5}, {11, 5}};
        System.out.println(solution(bandage, 30, attacks));
    }

    public static int solution(int[] bandage, int health, int[][] attacks) {
        int answer = health;

        int healCnt = 0;
        int attackCnt = 0;
        for(int i = 1; i <= attacks[attacks.length - 1][0]; i++) {
            if(i == attacks[attackCnt][0]) {
                answer -= attacks[attackCnt][1];
                attackCnt++;
                healCnt = 0;

                if(answer <= 0) {
                    return -1;
                }
            } else {
                answer += bandage[1];
                healCnt++;

                if(healCnt == bandage[0]) {
                    answer += bandage[2];
                    healCnt = 0;
                }

                if(answer > health) {
                    answer = health;
                }
            }
        }
        return answer;
    }
}
