package com.programmers.level1.p3;

public class 짝수와홀수 {
    public static void main(String[] args) {
        System.out.println(solution(3));
        System.out.println(solution(4));
    }

    public static String solution(int num) {
        return num % 2 == 0 ? "Even" : "Odd";
    }
}
