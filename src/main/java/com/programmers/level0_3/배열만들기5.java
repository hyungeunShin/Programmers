package com.programmers.level0_3;

import java.util.Arrays;
import java.util.stream.IntStream;

public class 배열만들기5 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"0123456789", "9876543210", "9999999999999"}, 50000, 5, 5)));
    }

    public static int[] solution(String[] intStrs, int k, int s, int l) {
        return Arrays.stream(intStrs)
                     .map(intStr -> intStr.substring(s, s + l))
                     .mapToInt(Integer::parseInt)
                     .filter(n -> n > k)
                     .toArray();
    }
}
