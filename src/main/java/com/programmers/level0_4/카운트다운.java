package com.programmers.level0_4;

import java.util.Arrays;
import java.util.stream.IntStream;

public class 카운트다운 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(10, 3)));
    }

    public static int[] solution(int start_num, int end_num) {
        return IntStream.rangeClosed(-start_num, -end_num)
                        .map(i -> i * -1)
                        .toArray();
    }
}
