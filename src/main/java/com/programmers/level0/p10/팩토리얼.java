package com.programmers.level0.p10;

public class 팩토리얼 {
    public static void main(String[] args) {
        System.out.println(solution(3628800));
        System.out.println(solution(7));
    }

    public static int solution(int n) {
        int mul = 1;
        int i = 0;

        while(mul <= n) {
            i++;
            mul *= i;
        }

        return i - 1;
    }
}
