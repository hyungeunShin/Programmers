package com.programmers.level0.p3;

import java.util.Arrays;
import java.util.stream.Collectors;

public class 글자이어붙여문자열만들기 {
    public static void main(String[] args) {
        System.out.println(solution("cvsgiorszzzmrpaqpe", new int[] {16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7}));
        System.out.println(solution("zpiaz", new int[] {1, 2, 0, 0, 3}));
    }

    public static String solution(String my_string, int[] index_list) {
        return Arrays.stream(index_list)
                     .mapToObj(n -> String.valueOf(my_string.charAt(n)))
                     .collect(Collectors.joining());
    }
}
