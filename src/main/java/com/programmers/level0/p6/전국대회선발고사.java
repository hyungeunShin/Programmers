package com.programmers.level0.p6;

import java.util.Comparator;
import java.util.stream.IntStream;

public class 전국대회선발고사 {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {3, 7, 2, 5, 4, 6, 1}, new boolean[] {false, true, true, true, true, false, false}));
        System.out.println(solution(new int[] {1, 2, 3}, new boolean[] {true, true, true}));
        System.out.println(solution(new int[] {6, 1, 5, 2, 3, 4}, new boolean[] {true, false, true, false, false, true}));
    }

    public static int solution(int[] rank, boolean[] attendance) {
//        Map<Integer, Integer> map = IntStream.range(0, rank.length)
//                                             .filter(i -> attendance[i])
//                                             .boxed()
//                                             .collect(Collectors.toMap(i -> rank[i], i -> i));
//
//        int[] array = map.entrySet().stream()
//                         .sorted(Map.Entry.comparingByKey())
//                         .mapToInt(Map.Entry::getValue)
//                         .limit(3)
//                         .toArray();
//
//        return (10000 * array[0]) + (100 * array[1]) + array[2];

//        PriorityQueue<Integer> que = new PriorityQueue<>((a, b) -> rank[a] - rank[b]);
//        for(int i = 0; i < attendance.length; i++) {
//            if(attendance[i])
//                que.add(i);
//        }
//
//        return que.poll() * 10000 + que.poll() * 100 + que.poll();

        return IntStream.range(0, rank.length)
                        .filter(i -> attendance[i])
                        .boxed()
                        .sorted(Comparator.comparing(i -> rank[i]))
                        .limit(3)
                        .reduce((current, next) -> current * 100 + next)
                        .orElse(0);
    }
}
