package com.programmers.level1.p4;

import java.util.Arrays;

public class 서울에서김서방찾기 {
    public static void main(String[] args) {
        System.out.println(solution(new String[] {"Jane", "Kim"}));
    }

    public static String solution(String[] seoul) {
        int index = Arrays.asList(seoul).indexOf("Kim");
        return "김서방은 " + index + "에 있다";
    }
}
