package com.programmers.level0.p9;

import java.util.Arrays;

public class A로B만들기 {
    public static void main(String[] args) {
        System.out.println(solution("olleh", "hello"));
        System.out.println(solution("allpe", "apple"));
    }

    public static int solution(String before, String after) {
//        char[] arr1 = before.toCharArray();
//        char[] arr2 = after.toCharArray();
//
//        Arrays.sort(arr1);
//        Arrays.sort(arr2);
//
//        return Arrays.equals(arr1, arr2) ? 1 : 0;

        for(int i = 0; i < before.length(); i++) {
            after = after.replaceFirst(before.substring(i, i + 1), "");
        }
        return after.isEmpty() ? 1: 0;
    }
}
