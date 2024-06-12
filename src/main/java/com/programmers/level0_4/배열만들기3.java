package com.programmers.level0_4;

import java.util.Arrays;

public class 배열만들기3 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[][] intervals = {{1,3}, {0,4}};
        System.out.println(Arrays.toString(solution(arr, intervals)));
    }

    public static int[] solution(int[] arr, int[][] intervals) {
        return Arrays.stream(intervals)
                     .map(interval -> Arrays.copyOfRange(arr, interval[0], interval[1] + 1))
                     .flatMapToInt(Arrays::stream)
                     .toArray();
    }
}
