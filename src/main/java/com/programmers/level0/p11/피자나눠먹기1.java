package com.programmers.level0.p11;

public class 피자나눠먹기1 {
    public static void main(String[] args) {
        System.out.println(solution(7));
        System.out.println(solution(1));
        System.out.println(solution(15));
    }

    public static int solution(int n) {
//        return (n - 1) / 7 + 1;
        return (n + 6) / 7;
    }
}
