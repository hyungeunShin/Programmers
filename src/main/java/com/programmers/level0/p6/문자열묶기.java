package com.programmers.level0.p6;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class 문자열묶기 {
    public static void main(String[] args) {
        System.out.println(solution(new String[] {"a","bc","d","efg","hi"}));
    }

    public static int solution(String[] strArr) {
        Map<Integer, List<String>> collect = Arrays.stream(strArr)
                                                   .collect(Collectors.groupingBy(String::length));

        return collect.values().stream().mapToInt(List::size).max().orElse(0);
    }
}
