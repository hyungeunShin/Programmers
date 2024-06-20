package com.programmers.level0.p5;

import java.util.Arrays;
import java.util.stream.IntStream;

public class 배열에서문자열대소문자변환 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[] {"AAA", "BBB", "CCC", "DDD"})));
        System.out.println(Arrays.toString(solution(new String[] {"abc", "AbC"})));
    }

    public static String[] solution(String[] strArr) {
//        for(int i = 0; i < strArr.length; i++) {
//            if(i % 2 == 0) {
//                strArr[i] = strArr[i].toLowerCase();
//            } else {
//                strArr[i] = strArr[i].toUpperCase();
//            }
//        }
//        return strArr;

        return IntStream.range(0, strArr.length)
                        .mapToObj(i -> i % 2 == 0 ? strArr[i].toLowerCase() : strArr[i].toUpperCase())
                        .toArray(String[]::new);
    }
}
