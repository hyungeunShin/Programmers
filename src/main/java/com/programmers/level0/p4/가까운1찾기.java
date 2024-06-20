package com.programmers.level0.p4;

import java.util.stream.IntStream;

public class 가까운1찾기 {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {0, 0, 0, 1}, 1));
        System.out.println(solution(new int[] {1, 0, 0, 1, 0, 0}, 4));
        System.out.println(solution(new int[] {1, 1, 1, 1, 0}, 3));
    }

    public static int solution(int[] arr, int idx) {
//        return IntStream.range(0, arr.length)
//                        .filter(i -> i >= idx && arr[i] == 1)
//                        .findFirst()
//                        .orElse(-1);

        return IntStream.range(idx, arr.length)
                        .filter(i -> arr[i] == 1)
                        .findFirst()
                        .orElse(-1);
    }
}
