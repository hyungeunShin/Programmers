package com.programmers.level0.p1;

import java.util.Scanner;

public class 문자열붙여서출력 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        System.out.println(a + b);
        System.out.println(a.concat(b));
    }
}
