package com.programmers.level1.p4;

public class 문자열을정수로바꾸기 {
    public static void main(String[] args) {
        System.out.println(solution("1234"));
        System.out.println(solution("-1234"));
    }

    public static int solution(String s) {
        return Integer.parseInt(s);
    }
}
