package com.programmers.level0.p5;

import java.util.Arrays;

public class x사이의개수 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("oxooxoxxox")));
        System.out.println(Arrays.toString(solution("xabcxdefxghi")));
    }

    public static int[] solution(String myString) {
        return Arrays.stream(myString.split("x", -1))
                     .mapToInt(String::length)
                     .toArray();
    }
}
