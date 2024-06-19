package com.programmers.level0.p8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class 인덱스바꾸기 {
    public static void main(String[] args) {
        System.out.println(solution("hello", 1, 2));
        System.out.println(solution("I love you", 3, 6));
    }

    public static String solution(String my_string, int num1, int num2) {
//        char[] arr = my_string.toCharArray();
//        arr[num1] = my_string.charAt(num2);
//        arr[num2] = my_string.charAt(num1);
//        return String.valueOf(arr);

        List<String> list = Arrays.stream(my_string.split("")).collect(Collectors.toList());
        Collections.swap(list, num1, num2);
        return String.join("", list);
    }
}
