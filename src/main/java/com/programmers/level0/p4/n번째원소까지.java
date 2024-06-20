package com.programmers.level0.p4;

import java.util.Arrays;

public class n번째원소까지 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[] {2, 1, 6}, 1)));
        System.out.println(Arrays.toString(solution(new int[] {5, 2, 1, 7, 5}, 3)));
    }

    public static int[] solution(int[] num_list, int n) {
        return Arrays.copyOfRange(num_list, 0, n);
    }
}
