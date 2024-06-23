package com.programmers.level0.p12;

public class 두수의나눗셈 {
    public static void main(String[] args) {
        System.out.println(solution(3, 2));
        System.out.println(solution(7, 3));
        System.out.println(solution(1, 16));
    }

    public static int solution(int num1, int num2) {
//        double a = (double) num1 / (double) num2;
//        return (int) (a * 1000);
        return num1 * 1000 / num2;
    }
}
