package com.programmers.level0.p10;

import java.util.Arrays;

public class 배열원소의길이 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[] {"We", "are", "the", "world!"})));
        System.out.println(Arrays.toString(solution(new String[] {"I", "Love", "Programmers."})));
    }

    public static int[] solution(String[] strlist) {
        return Arrays.stream(strlist).mapToInt(String::length).toArray();
    }
}
