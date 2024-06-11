package com.programmers.level0_2;

public class 문자열곱하기 {
    public static void main(String[] args) {
        System.out.println(solution("string", 3));
    }

    public static String solution(String my_string, int k) {
        return my_string.repeat(k);
    }
}
