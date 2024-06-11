package com.programmers.level0_2;

public class 두수의연산값비교 {
    public static void main(String[] args) {
        System.out.println(solution(2, 91));
        System.out.println(solution(91, 2));
    }

    public static int solution(int a, int b) {
        int ab = Integer.parseInt(String.valueOf(a) + b);
        int c = 2 * a * b;
        return Math.max(ab, c);
    }
}
