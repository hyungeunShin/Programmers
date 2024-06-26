package com.programmers.level0.p11;

public class 특정문자제거 {
    public static void main(String[] args) {
        System.out.println(solution("abcdef", "f"));
        System.out.println(solution("BCBdbe", "B"));
    }

    public static String solution(String my_string, String letter) {
        return my_string.replace(letter, "");
    }
}
