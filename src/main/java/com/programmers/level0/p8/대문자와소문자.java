package com.programmers.level0.p8;

public class 대문자와소문자 {
    public static void main(String[] args) {
        System.out.println(solution("cccCCC"));
        System.out.println(solution("abCdEfghIJ"));
    }

    public static String solution(String my_string) {
        String answer = "";
        for(char c : my_string.toCharArray()) {
            if(Character.isUpperCase(c)) {
                answer += String.valueOf(c).toLowerCase();
            } else {
                answer += String.valueOf(c).toUpperCase();
            }
        }
        return answer;
    }
}
