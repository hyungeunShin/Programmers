package com.programmers.level0.p8;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class 암호해독 {
    public static void main(String[] args) {
        System.out.println(solution("dfjardstddetckdaccccdegk", 4));
        System.out.println(solution("pfqallllabwaoclk", 2));
    }

    public static String solution(String cipher, int code) {
        return IntStream.range(0, cipher.length())
                        .filter(i -> (i + 1) % code == 0)
                        .mapToObj(i -> String.valueOf(cipher.charAt(i)))
                        .collect(Collectors.joining());
    }
}
