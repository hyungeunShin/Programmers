package com.programmers.level1.p3;

import java.util.Arrays;

public class k번째수 {
    public static void main(String[] args) {
        int[] arr1 = {1, 5, 2, 6, 3, 7, 4};
        int[][] arr2 = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        System.out.println(Arrays.toString(solution(arr1, arr2)));
    }

    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i = 0; i < commands.length; i++) {
            int[] a = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
            Arrays.sort(a);
            answer[i] = a[commands[i][2] - 1];
        }
        return answer;
    }
}
