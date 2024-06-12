package com.programmers.level0_3;

import java.util.Arrays;
import java.util.stream.IntStream;

public class 카운트업 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(3, 10)));
    }

    public static int[] solution(int start_num, int end_num) {
        return IntStream.rangeClosed(start_num, end_num).toArray();
    }
}
