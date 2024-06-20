package com.programmers.level0.p5;

import java.util.Arrays;

public class ad제거 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[] {"and", "notad", "abcd"})));
        System.out.println(Arrays.toString(solution(new String[] {"there","are","no","a","ds"})));
    }

    public static String[] solution(String[] strArr) {
        return Arrays.stream(strArr)
                     .filter(s -> !s.contains("ad"))
                     .toArray(String[]::new);
    }
}
