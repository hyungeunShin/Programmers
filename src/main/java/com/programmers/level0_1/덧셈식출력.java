package com.programmers.level0_1;

import java.util.Scanner;

public class 덧셈식출력 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.printf("%d + %d = %d", a, b, a + b);
    }
}
