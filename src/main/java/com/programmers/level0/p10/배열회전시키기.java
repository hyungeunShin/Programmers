package com.programmers.level0.p10;

import java.util.Arrays;

public class 배열회전시키기 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[] {1, 2, 3}, "right")));
        System.out.println(Arrays.toString(solution(new int[] {4, 455, 6, 4, -1, 45, 6}, "left")));
    }

    public static int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];

        if("left".equals(direction)) {
            if(numbers.length - 1 >= 0) {
                System.arraycopy(numbers, 1, answer, 0, numbers.length - 1);
            }
            answer[numbers.length - 1] = numbers[0];
        } else {
            if(numbers.length - 1 >= 0) {
                System.arraycopy(numbers, 0, answer, 1, numbers.length - 1);
            }
            answer[0] = numbers[numbers.length - 1];
        }

        return answer;
    }
}
