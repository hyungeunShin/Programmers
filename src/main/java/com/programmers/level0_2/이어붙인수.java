package com.programmers.level0_2;

import java.util.Arrays;
import java.util.stream.Collectors;

public class 이어붙인수 {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {3, 4, 5, 2, 1}));
        System.out.println(solution(new int[] {5, 7, 8, 3}));
    }

    public static int solution(int[] num_list) {
        String even = Arrays.stream(num_list).filter(n -> n % 2 == 0).mapToObj(String::valueOf).collect(Collectors.joining());
        String odd = Arrays.stream(num_list).filter(n -> n % 2 != 0).mapToObj(String::valueOf).collect(Collectors.joining());

        return Integer.parseInt(even) + Integer.parseInt(odd);
    }
}
