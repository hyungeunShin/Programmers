package com.programmers.level0_3;

import java.util.Arrays;
import java.util.stream.IntStream;

public class 접미사배열 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("banana")));
        System.out.println(Arrays.toString(solution("programmers")));
    }

    public static String[] solution(String my_string) {
        return IntStream.range(0, my_string.length())
                        .mapToObj(my_string::substring)
                        .sorted()
                        .toArray(String[]::new);
    }
}
