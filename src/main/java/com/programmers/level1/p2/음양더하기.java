package com.programmers.level1.p2;

import java.util.stream.IntStream;

public class 음양더하기 {
    public static void main(String[] args) {
        int[] absolutes1 = {4, 7, 12};
        int[] absolutes2 = {1, 2, 3};
        boolean[] signs1 = {true, false, true};
        boolean[] signs2 = {false, false, true};

        System.out.println(solution(absolutes1, signs1));
        System.out.println(solution(absolutes2, signs2));
    }

    public static int solution(int[] absolutes, boolean[] signs) {
        return IntStream.range(0, absolutes.length)
                        .map(i -> signs[i] ? absolutes[i] : absolutes[i] * -1)
                        .sum();
    }
}
