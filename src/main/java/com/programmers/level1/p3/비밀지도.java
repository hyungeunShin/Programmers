package com.programmers.level1.p3;

import java.util.Arrays;
import java.util.stream.IntStream;

public class 비밀지도 {
    public static void main(String[] args) {
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};
        int[] arr3 = {46, 33, 33 ,22, 31, 50};
        int[] arr4 = {27 ,56, 19, 14, 14, 10};

        System.out.println(Arrays.toString(solution(5, arr1, arr2)));
        System.out.println(Arrays.toString(solution(6, arr3, arr4)));
    }

    public static String[] solution(int n, int[] arr1, int[] arr2) {
//        String[] array = IntStream.range(0, n)
//                                  .map(i -> arr1[i] | arr2[i])
//                                  .mapToObj(Integer::toBinaryString)
//                                  .toArray(String[]::new);
//
//        for(int i = 0; i < array.length; i++) {
//            array[i] = String.format("%" + n + "s", array[i]).replace("0", " ").replace("1", "#");
//        }
//        return array;

        String[] answer = new String[n];
        String temp;

        for(int i = 0 ; i < n ; i++) {
            temp = String.format("%16s", Integer.toBinaryString(arr1[i] | arr2[i]));
            temp = temp.substring(temp.length() - n);
            temp = temp.replaceAll("1", "#");
            temp = temp.replaceAll("0", " ");
            answer[i] = temp;
        }

        return answer;
    }
}
