package com.programmers.level1.p3;

import java.util.Scanner;

public class 직사각형별찍기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < b; i++) {
            sb.append("*".repeat(a));
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
