package com.programmers.level0.p9;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class k의개수 {
    public static void main(String[] args) {
        System.out.println(solution(1, 13, 1));
        System.out.println(solution(10, 50, 5));
        System.out.println(solution(3, 10, 2));
    }

    public static int solution(int i, int j, int k) {
//        String str = IntStream.rangeClosed(i, j).mapToObj(String::valueOf).collect(Collectors.joining());
//        return (int) Arrays.stream(str.split("")).filter(s -> s.equals(String.valueOf(k))).count();

        String str = "";
        for(int a = i; a <= j; a++) {
            str += a + "";
        }
        return str.length() - str.replace(k + "", "").length();
    }
}
