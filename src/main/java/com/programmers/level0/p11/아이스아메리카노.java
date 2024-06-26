package com.programmers.level0.p11;

import java.util.Arrays;

public class 아이스아메리카노 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(5500)));
        System.out.println(Arrays.toString(solution(15000)));
    }

    public static int[] solution(int money) {
        return new int[] {money / 5500, money % 5500};
    }
}
