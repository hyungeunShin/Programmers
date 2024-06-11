package com.programmers.level0_1;

import java.util.Scanner;

public class 문자열반복출력 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            System.out.print(str);
        }
    }
}
