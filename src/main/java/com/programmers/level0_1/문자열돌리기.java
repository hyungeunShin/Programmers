package com.programmers.level0_1;

import java.util.Arrays;
import java.util.Scanner;

public class 문자열돌리기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        Arrays.stream(a.split("")).forEach(System.out::println);
    }
}
