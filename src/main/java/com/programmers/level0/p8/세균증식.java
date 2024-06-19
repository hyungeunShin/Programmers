package com.programmers.level0.p8;

public class 세균증식 {
    public static void main(String[] args) {
        System.out.println(solution(2, 10));
        System.out.println(solution(7, 15));
    }

    public static int solution(int n, int t) {
        //return (int) (Math.pow(2, t) * n);
        return n << t;
    }
}
