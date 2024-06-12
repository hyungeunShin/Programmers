package com.programmers.level0_4;

import java.util.Arrays;
import java.util.stream.IntStream;

public class 왼쪽오른쪽 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"u", "u", "l", "r"})));
        System.out.println(Arrays.toString(solution(new String[]{"l"})));
    }

    public static String[] solution(String[] str_list) {
//        for(int i = 0; i < str_list.length; i++) {
//            if ("l".equals(str_list[i])) {
//                return Arrays.copyOfRange(str_list, 0, i);
//            } else if ("r".equals(str_list[i])) {
//                return Arrays.copyOfRange(str_list, i + 1, str_list.length);
//            }
//        }
//        return new String[] {};

        return IntStream.range(0, str_list.length)
                        .boxed()
                        .filter(i -> str_list[i].equals("l") || str_list[i].equals("r"))
                        .findFirst()
                        .map(i -> {
                            if (str_list[i].equals("l")) {
                                return Arrays.copyOfRange(str_list, 0, i);
                            }
                            return Arrays.copyOfRange(str_list, i + 1, str_list.length);
                        })
                        .orElseGet(() -> new String[]{});
    }
}
