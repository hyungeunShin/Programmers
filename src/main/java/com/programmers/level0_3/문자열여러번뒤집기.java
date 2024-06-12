package com.programmers.level0_3;

public class 문자열여러번뒤집기 {
    public static void main(String[] args) {
        System.out.println(solution("rermgorpsam", new int[][] {{2,3}, {0,7}, {5,9}, {6,10}}));
    }

    public static String solution(String my_string, int[][] queries) {
        StringBuilder answer = new StringBuilder(my_string);

        for (int[] i : queries) {
            int s = i[0];
            int e = i[1];

            StringBuilder sb = new StringBuilder(answer.substring(s, e + 1));
            sb.reverse();
            answer.replace(s, e + 1, sb.toString());
        }

        return answer.toString();
    }
}
