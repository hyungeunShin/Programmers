package com.programmers.level0.p4;

import java.util.stream.IntStream;

public class 홀수vs짝수 {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {4, 2, 6, 1, 7, 6}));
        System.out.println(solution(new int[] {-1, 2, 5, 6, 3}));
    }

    public static int solution(int[] num_list) {
        int odd = IntStream.range(0, num_list.length).filter(i -> (i + 1) % 2 != 0).map(i -> num_list[i]).sum();
        int even = IntStream.range(0, num_list.length).filter(i -> (i + 1) % 2 == 0).map(i -> num_list[i]).sum();

        return Math.max(odd, even);
    }
}
