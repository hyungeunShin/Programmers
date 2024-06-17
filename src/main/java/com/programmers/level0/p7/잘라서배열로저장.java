package com.programmers.level0.p7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 잘라서배열로저장 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("abc1Addfggg4556b", 6)));
        System.out.println(Arrays.toString(solution("abcdef123", 3)));
    }

    public static String[] solution(String my_str, int n) {
        List<String> list = new ArrayList<>();

        for(int i = 0; i < my_str.length(); i += n) {
            int end = Math.min(i + n, my_str.length());
            list.add(my_str.substring(i, end));
        }

        return list.toArray(String[]::new);
    }
}
