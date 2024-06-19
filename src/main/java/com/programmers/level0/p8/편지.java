package com.programmers.level0.p8;

public class 편지 {
    public static void main(String[] args) {
        System.out.println(solution("happy birthday!"));
        System.out.println(solution("I love you~"));
    }

    public static int solution(String message) {
        return message.length() * 2;
    }
}
