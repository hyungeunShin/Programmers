package com.programmers.level0.p6;

public class 문자열정수의합 {
    public static void main(String[] args) {
        System.out.println(solution("123456789"));
        System.out.println(solution("1000000"));
    }

    public static int solution(String num_str) {
//        return Arrays.stream(num_str.split("")).mapToInt(Integer::parseInt).sum();

        return num_str.chars().map(c -> c - 48).sum();
    }
}
