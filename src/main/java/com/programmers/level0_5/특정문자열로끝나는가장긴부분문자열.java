package com.programmers.level0_5;

public class 특정문자열로끝나는가장긴부분문자열 {
    public static void main(String[] args) {
        System.out.println(solution("AbCdEFG", "dE"));
        System.out.println(solution("AAAAaaaa", "a"));
    }

    public static String solution(String myString, String pat) {
        return myString.substring(0, myString.lastIndexOf(pat) + pat.length());
    }
}
