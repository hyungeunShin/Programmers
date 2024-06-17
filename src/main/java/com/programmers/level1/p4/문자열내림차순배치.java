package com.programmers.level1.p4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class 문자열내림차순배치 {
    public static void main(String[] args) {
        System.out.println(solution("Zbcdefg"));
    }

    public static String solution(String s) {
//        char[] arr = s.toCharArray();
//        Arrays.sort(arr);
//        return new StringBuilder(String.valueOf(arr)).reverse().toString();

        return Arrays.stream(s.split(""))
                     .sorted(Comparator.reverseOrder())
                     .collect(Collectors.joining());
    }
}
