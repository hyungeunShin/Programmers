package com.programmers.level0.p10;

import java.util.Arrays;

public class 문자열정렬하기1 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("hi12392")));
        System.out.println(Arrays.toString(solution("p2o4i8gj2")));
        System.out.println(Arrays.toString(solution("abcde0")));
    }

    public static int[] solution(String my_string) {
//        return my_string.chars()
//                        .filter(Character::isDigit)
//                        .mapToObj(c -> String.valueOf((char) c))
//                        .mapToInt(Integer::parseInt)
//                        .sorted()
//                        .toArray();

        return Arrays.stream(my_string.replaceAll("[A-Z|a-z]", "").split(""))
                     .sorted()
                     .mapToInt(Integer::parseInt)
                     .toArray();
    }
}
