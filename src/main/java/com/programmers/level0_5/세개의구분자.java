package com.programmers.level0_5;

import java.util.Arrays;

public class 세개의구분자 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("baconlettucetomato")));
        System.out.println(Arrays.toString(solution("abcd")));
        System.out.println(Arrays.toString(solution("cabab")));
    }

    public static String[] solution(String myStr) {
//        myStr = myStr.replace("a", " ").replace("b", " ").replace("c", " ");
//        String[] array = Arrays.stream(myStr.split(" ")).filter(s -> !s.isEmpty()).toArray(String[]::new);
//
//        return array.length == 0 ? new String[] {"EMPTY"} : array;

        String[] arr = Arrays.stream(myStr.split("[abc]+")).filter(str -> !str.isEmpty()).toArray(String[]::new);
        return arr.length == 0 ? new String[] {"EMPTY"} : arr;
    }
}
