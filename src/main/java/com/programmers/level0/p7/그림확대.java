package com.programmers.level0.p7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 그림확대 {
    public static void main(String[] args) {
        String[] arr1 = {".xx...xx.", "x..x.x..x", "x...x...x", ".x.....x.", "..x...x..", "...x.x...", "....x...."};
        String[] arr2 = {"x.x", ".x.", "x.x"};

        System.out.println(Arrays.toString(solution(arr1, 2)));
        System.out.println(Arrays.toString(solution(arr2, 3)));
    }

    public static String[] solution(String[] picture, int k) {
        List<String> list = new ArrayList<>();
        for(String s : picture) {
            String repeat = "";
            for(char c : s.toCharArray()) {
                repeat += String.valueOf(c).repeat(k);
            }

            for(int j = 0; j < k; j++) {
                list.add(repeat);
            }
        }
        return list.toArray(String[]::new);
    }
}
