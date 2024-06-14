package com.programmers.level0_5;

import java.util.Arrays;

public class 문자열잘라서정렬 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("axbxcxdx")));
        System.out.println(Arrays.toString(solution("dxccxbbbxaaaa")));
    }

    public static String[] solution(String myString) {
        return Arrays.stream(myString.split("x"))
                     .filter(s -> !s.isEmpty())
                     .sorted()
                     .toArray(String[]::new);
    }
}
