package com.programmers.level0.p9;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class 중복된문자제거 {
    public static void main(String[] args) {
        System.out.println(solution("people"));
        System.out.println(solution("We are the world"));
    }

    public static String solution(String my_string) {
//        return my_string.chars()
//                        .mapToObj(Character::toString)
//                        .distinct()
//                        .collect(Collectors.joining());

        Set<String> set = new LinkedHashSet<>(Arrays.asList(my_string.split("")));
        return String.join("", set);
    }
}
