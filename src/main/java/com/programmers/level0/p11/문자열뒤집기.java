package com.programmers.level0.p11;

public class 문자열뒤집기 {
    public static void main(String[] args) {
        System.out.println(solution("jaron"));
        System.out.println(solution("bread"));
    }

    public static String solution(String my_string) {
        return new StringBuffer(my_string).reverse().toString();
    }
}
