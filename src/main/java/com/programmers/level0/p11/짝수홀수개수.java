package com.programmers.level0.p11;

import java.util.Arrays;
import java.util.stream.Collectors;

public class 짝수홀수개수 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[] {1, 2, 3, 4, 5})));
        System.out.println(Arrays.toString(solution(new int[] {1, 3, 5, 7})));
    }

    public static int[] solution(int[] num_list) {
//        int even = (int) Arrays.stream(num_list).filter(n -> n % 2 == 0).count();
//        int odd = (int) Arrays.stream(num_list).filter(n -> n % 2 != 0).count();
//
//        return new int[] {even, odd};

//        int[] answer = new int[2];
//        for(int i : num_list) {
//            answer[i % 2]++;
//        }
//        return answer;

        return Arrays.stream(num_list)
                     .boxed()
                     .collect(Collectors.partitioningBy(number -> number % 2 == 1, Collectors.counting()))
                     .values().stream()
                     .mapToInt(Long::intValue)
                     .toArray();
    }
}
