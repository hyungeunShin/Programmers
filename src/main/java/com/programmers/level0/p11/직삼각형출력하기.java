package com.programmers.level0.p11;

import java.util.Scanner;

public class 직삼각형출력하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            System.out.println("*".repeat(i));
        }
    }
}
