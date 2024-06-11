package com.programmers.level0_1;

import java.util.Scanner;

public class 대소문자바꿔서출력 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        String output = "";
        for(Character c : a.toCharArray()) {
            if(Character.isUpperCase(c)) {
                output += Character.toLowerCase(c);
            } else if(Character.isLowerCase(c)) {
                output += Character.toUpperCase(c);
            }
        }
        System.out.println(output);
    }
}
