package com.programmers.level0_3;

import java.util.Arrays;

public class 문자개수세기 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("Programmers")));
    }

    public static int[] solution(String my_string) {
        int[] answer = new int[52];
        for(char c : my_string.toCharArray()) {
            if(Character.isUpperCase(c)) {
                answer[c - 'A']++;
            } else {
                answer[c - 'a' + 26]++;
            }
        }
        return answer;
    }
}
