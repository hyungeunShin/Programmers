package com.programmers.level0_5;

import java.util.Arrays;

public class 일로만들기 {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {12, 4, 15, 1, 14}));
    }

    public static int solution(int[] num_list) {
//        int answer = 0;
//        for(int i : num_list) {
//            while(i != 1) {
//                i /= 2;
//                ++answer;
//            }
//        }
//        return answer;

        return Arrays.stream(num_list)
                     .map(i -> Integer.toBinaryString(i).length() - 1)
                     .sum();
    }
}
