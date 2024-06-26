package com.programmers.level0.p11;

public class 피자나눠먹기3 {
    public static void main(String[] args) {
        System.out.println(solution(7, 10));
        System.out.println(solution(4, 12));
    }

    public static int solution(int slice, int n) {
        return (n - 1) / slice + 1;
    }
}
