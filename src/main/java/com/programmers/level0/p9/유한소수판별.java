package com.programmers.level0.p9;

public class 유한소수판별 {
    public static void main(String[] args) {
        System.out.println(solution(7, 20));
        System.out.println(solution(11, 22));
        System.out.println(solution(12, 21));
    }

    public static int solution(int a, int b) {
        int g = b / gcd(a, b);

        while(g != 1) {
            if(g % 2 == 0) {
                g /= 2;
            } else if(g % 5 == 0) {
                g /= 5;
            } else {
                return 2;
            }
        }
        return 1;
    }

    private static int gcd(int a, int b) {
        if(b == 0) {
            return a;
        }

        return gcd(b, a % b);
    }
}
