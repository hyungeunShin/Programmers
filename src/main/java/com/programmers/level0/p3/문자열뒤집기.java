package com.programmers.level0.p3;

public class 문자열뒤집기 {
    public static void main(String[] args) {
        System.out.println(solution("Progra21Sremm3", 6, 12));
        System.out.println(solution("Stanley1yelnatS", 4, 10));
    }

    public static String solution(String my_string, int s, int e) {
        StringBuilder a = new StringBuilder(my_string);

        StringBuilder sb = new StringBuilder(my_string.substring(s, e + 1));
        sb.reverse();
        a.replace(s, e + 1, sb.toString());

        return a.toString();
    }
}
