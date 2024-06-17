package com.programmers.level0.p7;

import java.util.ArrayList;
import java.util.List;

public class 그림확대 {
    public static void main(String[] args) {

    }

    public String[] solution(String[] picture, int k) {
        List<String> list = new ArrayList<>();
        for(String s : picture) {
            String repeat = "";
            for (char c : s.toCharArray()) {
                repeat += String.valueOf(c).repeat(k);
            }

            for (int j = 0; j < k; j++) {
                list.add(repeat);
            }
        }
        return list.toArray(String[]::new);
    }
}
