package com.programmers.level1.p4;

public class 문자열다루기 {
    public static void main(String[] args) {
        System.out.println(solution("a234"));
        System.out.println(solution("1234"));
    }

    public static boolean solution(String s) {
        if(s.length() == 4 || s.length() == 6) {
            return s.matches("\\d+");
        }
        return false;
    }
}
