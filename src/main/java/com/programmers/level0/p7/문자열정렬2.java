package com.programmers.level0.p7;

import java.util.Arrays;

public class 문자열정렬2 {
    public static void main(String[] args) {
        System.out.println(solution("Bcad"));
        System.out.println(solution("heLLo"));
        System.out.println(solution("Python"));
    }

    public static String solution(String my_string) {
//        return my_string.toLowerCase()
//                        .chars()
//                        .sorted()
//                        .mapToObj(c -> String.valueOf((char) c))
//                        .collect(Collectors.joining());

        char[] c = my_string.toLowerCase().toCharArray();
        Arrays.sort(c);
        return new String(c);
    }
}
