package com.programmers.level0_4;

import java.util.Arrays;
import java.util.stream.IntStream;

public class five명씩 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"})));
    }

    public static String[] solution(String[] names) {
        return IntStream.range(0, names.length)
                        .filter(i -> i % 5 == 0)
                        .mapToObj(i -> names[i])
                        .toArray(String[]::new);
    }
}
