package com.programmers.level0_2;

public class 주사위게임2 {
    public static void main(String[] args) {
        System.out.println(solution(2, 6, 1));
        System.out.println(solution(5, 3, 3));
        System.out.println(solution(4, 4, 4));
    }

    public static int solution(int a, int b, int c) {
        if(a != b && b != c && a != c) {
            return a + b + c;
        } else if(a == b && b == c) {
            return (a + b + c) * (a * a + b * b + c * c) * (a * a * a + b * b * b + c * c * c);
        } else {
            return (a + b + c) * (a * a + b * b + c * c);
        }
    }
}
