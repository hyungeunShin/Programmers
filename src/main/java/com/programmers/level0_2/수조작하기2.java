package com.programmers.level0_2;

public class 수조작하기2 {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1}));
    }

    public static String solution(int[] numLog) {
        String answer = "";
        for(int i = 1; i <= numLog.length - 1; i++) {
            int a = numLog[i] - numLog[i - 1];

            if(a == 1) {
                answer += "w";
            } else if(a == -1) {
                answer += "s";
            } else if(a == 10) {
                answer += "d";
            } else {
                answer += "a";
            }
        }
        return answer;
    }
}
