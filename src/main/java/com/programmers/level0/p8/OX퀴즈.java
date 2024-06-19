package com.programmers.level0.p8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OX퀴즈 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"3 - 4 = -3", "5 + 6 = 11"})));
        System.out.println(Arrays.toString(solution(new String[]{"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"})));
    }

    public static String[] solution(String[] quiz) {
        List<String> list = new ArrayList<>();
        for(String q : quiz) {
            String[] s = q.split(" ");
            boolean b = false;
            if("+".equals(s[1])) {
                b = (Integer.parseInt(s[0]) + Integer.parseInt(s[2]) == Integer.parseInt(s[4]));
            } else {
                b = (Integer.parseInt(s[0]) - Integer.parseInt(s[2]) == Integer.parseInt(s[4]));
            }
            list.add(b ? "O" : "X");
        }
        return list.toArray(String[]::new);
    }
}
