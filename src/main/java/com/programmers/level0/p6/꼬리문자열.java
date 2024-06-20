package com.programmers.level0.p6;

import java.util.Arrays;
import java.util.stream.Collectors;

public class 꼬리문자열 {
    public static void main(String[] args) {
        System.out.println(solution(new String[] {"abc", "def", "ghi"}, "ef"));
        System.out.println(solution(new String[] {"abc", "bbc", "cbc"}, "c"));
    }

    public static String solution(String[] str_list, String ex) {
        return Arrays.stream(str_list)
                     .filter(s -> !s.contains(ex))
                     .collect(Collectors.joining());
    }
}
