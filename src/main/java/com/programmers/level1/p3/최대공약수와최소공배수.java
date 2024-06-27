package com.programmers.level1.p3;

import java.util.Arrays;

public class 최대공약수와최소공배수 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(3, 12)));
        System.out.println(Arrays.toString(solution(2, 5)));
    }

    public static int[] solution(int n, int m) {
//        return new int[] {gcd(n, m), lcm(n, m)};

        int[] answer = new int[2];
        for(int i = 1; i < n + m; i++) {
            if(n % i == 0 && m % i == 0) {
                answer[0] = i;
                answer[1] = n * m / answer[0];
            }
        }
        return answer;
    }

    private static int gcd(int a, int b) {
        if(b == 0) {
            return a;
        }

        return gcd(b, a % b);
    }

    private static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}
