package com.programmers.level0.p5;

import java.util.Arrays;

public class 공백으로구분2 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(" i    love  you")));
        System.out.println(Arrays.toString(solution("    programmers  ")));
    }

    public static String[] solution(String my_string) {
//        return Arrays.stream(my_string.split(" "))
//                     .filter(s -> !"".equals(s))
//                     .toArray(String[]::new);

        return my_string.trim().split("\\s+");

//        return my_string.trim().split("[ ]+");
    }
}
