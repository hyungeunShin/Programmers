package com.programmers.level1.p3;

import java.util.Arrays;
import java.util.stream.IntStream;

public class 모의고사 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[] {1,2,3,4,5})));
        System.out.println(Arrays.toString(solution(new int[] {1,3,2,4,2})));
    }

    public static int[] solution(int[] answers) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] arr3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] answer = new int[3];
        for(int i = 0; i < answers.length; i++) {
            if(answers[i] == arr1[i % arr1.length]) {
                answer[0]++;
            }
            if(answers[i] == arr2[i % arr2.length]) {
                answer[1]++;
            }
            if(answers[i] == arr3[i % arr3.length]) {
                answer[2]++;
            }
        }

        return IntStream.range(0, 3)
                        .filter(i -> answer[i] == Math.max(answer[0], Math.max(answer[1], answer[2])))
                        .map(i -> i + 1)
                        .sorted()
                        .toArray();
    }
}
