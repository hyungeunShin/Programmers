package com.programmers.level0.p11;

public class 나이출력 {
    public static void main(String[] args) {
        System.out.println(solution(40));
        System.out.println(solution(23));
    }

    public static int solution(int age) {
        return 2024 - age - 1;
    }
}
