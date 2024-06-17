package com.programmers.level1.p4;

import java.util.Comparator;
import java.util.stream.Collectors;

public class 정수내림차순으로배치 {
    public static void main(String[] args) {
        System.out.println(solution(118372));
    }

    public static long solution(long n) {
//        Integer[] array = Arrays.stream(String.valueOf(n).split(""))
//                                .map(Integer::parseInt)
//                                .sorted(Comparator.reverseOrder())
//                                .toArray(Integer[]::new);
//
//        return Long.parseLong(Arrays.stream(array).map(String::valueOf).collect(Collectors.joining()));

//        String[] arr = String.valueOf(n).split("");
//        Arrays.sort(arr);
//
//        StringBuilder sb = new StringBuilder();
//        for(String a : arr) {
//            sb.append(a);
//        }
//
//        return Long.parseLong(sb.reverse().toString());

        String.valueOf(n).chars().mapToObj(c -> (char) c).forEach(c -> System.out.println(c));

        return Long.parseLong(String.valueOf(n).chars()
                                               .mapToObj(c -> String.valueOf((char) c))
                                               .sorted(Comparator.reverseOrder())
                                               .collect(Collectors.joining()));
    }
}
