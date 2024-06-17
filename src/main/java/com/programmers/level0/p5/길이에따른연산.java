package com.programmers.level0.p5;

import java.util.Arrays;
import java.util.stream.IntStream;

public class 길이에따른연산 {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1}));
        System.out.println(solution(new int[] {2, 3, 4, 5}));
    }

    public static int solution(int[] num_list) {
//        int answer = 0;
//        if(num_list.length >= 11) {
//            for(int i : num_list) {
//                answer += i;
//            }
//        } else {
//            answer = 1;
//            for(int i : num_list) {
//                answer *= i;
//            }
//        }
//
//        return answer;

        IntStream stream = Arrays.stream(num_list);
        return num_list.length > 10 ? stream.sum() : stream.reduce(1, (a, b) -> a * b);
    }
}
