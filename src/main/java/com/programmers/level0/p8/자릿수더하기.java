package com.programmers.level0.p8;

import java.util.Arrays;

public class 자릿수더하기 {
    public static void main(String[] args) {
        System.out.println(solution(1234));
        System.out.println(solution(930211));
    }

    public static int solution(int n) {
        return Arrays.stream(String.valueOf(n).split("")).mapToInt(Integer::parseInt).sum();
    }
}
