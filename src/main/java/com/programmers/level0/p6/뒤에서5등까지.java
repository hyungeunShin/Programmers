package com.programmers.level0.p6;

import java.util.Arrays;

public class 뒤에서5등까지 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[] {12, 4, 15, 46, 38, 1, 14})));
    }

    public static int[] solution(int[] num_list) {
//        Arrays.sort(num_list);
//        return Arrays.copyOfRange(num_list, 0, 5);

        return Arrays.stream(num_list)
                     .sorted()
                     .limit(5)
                     .toArray();
    }
}
