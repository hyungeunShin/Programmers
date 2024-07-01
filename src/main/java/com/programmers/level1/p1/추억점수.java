package com.programmers.level1.p1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class 추억점수 {
    public static void main(String[] args) {
        String[] name1 = {"may", "kein", "kain", "radi"};
        int[] yearning1 = {5, 10, 1, 3};
        String[][] photo1 = {{"may", "kein", "kain", "radi"}, {"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};
        System.out.println(Arrays.toString(solution(name1, yearning1, photo1)));

        String[] name2 = {"kali", "mari", "don"};
        int[] yearning2 = {11, 1, 55};
        String[][] photo2 = {{"kali", "mari", "don"}, {"pony", "tom", "teddy"}, {"con", "mona", "don"}};
        System.out.println(Arrays.toString(solution(name2, yearning2, photo2)));
    }

    public static int[] solution(String[] name, int[] yearning, String[][] photo) {
//        int[] arr = new int[photo.length];
//        Map<String, Integer> map = new HashMap<>();
//
//        for(int i = 0; i < name.length; i++) {
//            map.put(name[i], yearning[i]);
//        }
//
//        for(int i = 0; i < photo.length; i++) {
//            int sum = 0;
//            for(int j = 0; j < photo[i].length; j++) {
//                if(map.containsKey(photo[i][j])) {
//                    sum += map.get(photo[i][j]);
//                }
//            }
//            arr[i] = sum;
//        }
//
//        return arr;

        Map<String, Integer> map = IntStream.range(0, name.length)
                                            .mapToObj(i -> Map.entry(name[i], yearning[i]))
                                            .collect(Collectors.toSet())
                                            .stream()
                                            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        return Arrays.stream(photo)
                     .mapToInt(s -> Arrays.stream(s)
                                          .mapToInt(value -> map.getOrDefault(value, 0))
                                          .sum()
                     )
                    .toArray();
    }
}
