package com.programmers.level1.p4;

import java.util.Arrays;

public class 자연수뒤집어배열로만들기 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(12345)));
    }

    public static int[] solution(long n) {
        StringBuilder sb = new StringBuilder(String.valueOf(n));
        return sb.reverse().toString().chars()
                                      .map(Character::getNumericValue)
                                      .toArray();
    }
}
