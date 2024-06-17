package com.programmers.level1.p4;

public class 수박수박수박 {
    public static void main(String[] args) {
        System.out.println(solution(3));
        System.out.println(solution(4));
    }

    public static String solution(int n) {
        String answer = "수박".repeat(n / 2);
        return n % 2 == 0 ? answer : answer + "수";
    }
}
