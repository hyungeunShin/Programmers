package com.programmers.level1.p4;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class 이상한문자만들기 {
    public static void main(String[] args) {
        System.out.println(solution("try hello world"));
    }

    public static String solution(String s) {
        return Arrays.stream(s.split(" ", -1))
                .map(ss -> IntStream.range(0, ss.length())
                                    .mapToObj(i -> {
                                        if (i % 2 == 0) {
                                            return String.valueOf(ss.charAt(i)).toUpperCase();
                                        } else {
                                            return String.valueOf(ss.charAt(i)).toLowerCase();
                                        }
                                    }).collect(Collectors.joining())
                ).collect(Collectors.joining(" "));
    }
}
