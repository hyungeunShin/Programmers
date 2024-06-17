package com.programmers.level0.p2;

public class 더크게합치기 {
    public static void main(String[] args) {
        System.out.println(solution(9, 91));
        System.out.println(solution(89, 8));
    }

    public static int solution(int a, int b) {
        int ab = Integer.parseInt(String.valueOf(a) + b);
        int ba = Integer.parseInt(String.valueOf(b) + a);

        return Math.max(ab, ba);
    }
}
