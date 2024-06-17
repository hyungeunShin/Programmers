package com.programmers.level0.p7;

import java.util.Arrays;

public class 정수찾기 {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {1, 2, 3, 4, 5}, 3));
        System.out.println(solution(new int[] {15, 98, 23, 2, 15}, 20));
    }

    public static int solution(int[] num_list, int n) {
//        return Arrays.stream(num_list)
//                     .boxed()
//                     .collect(Collectors.toList()).contains(n) ? 1 : 0;

        return Arrays.stream(num_list)
                     .anyMatch(num -> num == n) ? 1 : 0;
    }
}
