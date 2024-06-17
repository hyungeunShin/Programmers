package com.programmers;

import java.util.Arrays;

public class 최대공약수와최소공배수 {
    public static void main(String[] args) {
        int n = 2;
        int m = 5;

        int[] ints = {gcd(n, m), lcm(n, m)};
        System.out.println(Arrays.toString(ints));
    }

    public static int gcd(int a, int b) {
        if(b == 0) return a;
        return gcd(b, a % b);
    }

    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}
