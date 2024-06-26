package com.programmers.level0.p10;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class 모스부호1 {
    public static void main(String[] args) {
        System.out.println(solution(".... . .-.. .-.. ---"));
        System.out.println(solution(".--. -.-- - .... --- -."));
    }

    public static String solution(String letter) {
        String[] mos = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        int[] array = Arrays.stream(letter.split(" "))
                            .mapToInt(s -> IntStream.range(0, mos.length)
                                    .filter(i -> s.equals(mos[i]))
                                    .findFirst()
                                    .getAsInt()
                            ).toArray();

        return Arrays.stream(array)
                .mapToObj(i -> String.valueOf((char) (i + 97)))
                .collect(Collectors.joining());
    }
}
