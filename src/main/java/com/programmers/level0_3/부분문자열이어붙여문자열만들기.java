package com.programmers.level0_3;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class 부분문자열이어붙여문자열만들기 {
    public static void main(String[] args) {
        String[] my_strings = {"progressive", "hamburger", "hammer", "ahocorasick"};
        int[][] parts = {{0,4}, {1,2}, {3,5}, {7,7}};
        System.out.println(solution(my_strings, parts));
    }

    public static String solution(String[] my_strings, int[][] parts) {
        return IntStream.range(0, parts.length)
                        .mapToObj(i -> my_strings[i].substring(parts[i][0], parts[i][1] + 1))
                        .collect(Collectors.joining());
    }
}
