package com.programmers.level0.p7;

import java.util.Arrays;
import java.util.stream.Collectors;

public class 칠의개수 {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {7, 77, 17}));
        System.out.println(solution(new int[] {10, 29}));
    }

    public static int solution(int[] array) {
        String s = Arrays.stream(array).mapToObj(String::valueOf).collect(Collectors.joining());
        return (int) s.chars().filter(c -> (char) c == '7').count();
    }
}
