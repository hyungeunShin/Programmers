package com.programmers.level0_3;

public class 문자열의앞의n글자 {
    public static void main(String[] args) {
        System.out.println(solution("ProgrammerS123", 11));
        System.out.println(solution("He110W0r1d", 5));
    }

    public static String solution(String my_string, int n) {
        return my_string.substring(0, n);
    }
}
