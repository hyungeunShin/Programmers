package com.programmers.level0_5;

import java.util.Arrays;
import java.util.stream.Stream;

public class 공백으로구분1 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("i love you")));
        System.out.println(Arrays.toString(solution("programmers")));
    }

    public static String[] solution(String my_string) {
        return my_string.split(" ");
    }
}
