package com.programmers.level0.p11;

import java.util.stream.Collectors;

public class 외계행성의나이 {
    public static void main(String[] args) {
        System.out.println(solution(23));
        System.out.println(solution(51));
        System.out.println(solution(100));
    }

    public static String solution(int age) {
        return String.valueOf(age).chars()
                     .mapToObj(i -> String.valueOf((char) (i+49)))
                     .collect(Collectors.joining());
    }
}
