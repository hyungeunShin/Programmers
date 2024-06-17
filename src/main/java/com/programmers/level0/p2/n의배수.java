package com.programmers.level0.p2;

public class n의배수 {
    public static void main(String[] args) {
        System.out.println(solution(98, 2));
        System.out.println(solution(34, 3));
    }

    public static int solution(int num, int n) {
        return num % n == 0 ? 1 : 0;
    }
}
