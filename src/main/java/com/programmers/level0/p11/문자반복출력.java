package com.programmers.level0.p11;

import java.util.stream.Collectors;

public class 문자반복출력 {
    public static void main(String[] args) {
        System.out.println(solution("hello", 3));
    }

    public static String solution(String my_string, int n) {
        return my_string.chars()
                        .mapToObj(s -> String.valueOf((char) s).repeat(n))
                        .collect(Collectors.joining());
    }
}
