package com.programmers.level0_4;

import java.util.Arrays;

public class 리스트자르기 {
    public static void main(String[] args) {
        int[] slicer = {1,5,2};
        int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println(Arrays.toString(solution(3, slicer, num_list)));
        System.out.println(Arrays.toString(solution(4, slicer, num_list)));
    }

    public static int[] solution(int n, int[] slicer, int[] num_list) {
//        int[] answer;
//
//        if(n == 1) {
//            answer = Arrays.copyOfRange(num_list, 0, slicer[1] + 1);
//        } else if(n == 2) {
//            answer = Arrays.copyOfRange(num_list, slicer[0], num_list.length);
//        } else if(n == 3) {
//            answer = Arrays.copyOfRange(num_list, slicer[0], slicer[1] + 1);
//        } else {
//            int s = (slicer[1] - slicer[0]) / slicer[2] + 1;
//            answer = new int[s];
//
//            for (int i = 0; i < s; i++) {
//                answer[i] = num_list[slicer[0] + i * slicer[2]];
//            }
//        }
//
//        return answer;
        int start = n == 1 ? 0 : slicer[0];
        int end = n == 2 ? num_list.length - 1 : slicer[1];
        int step = n == 4 ? slicer[2] : 1;
        int[] answer = new int[(end - start + step) / step];
        for(int i = start, j = 0; i <= end; i += step) {
            answer[j++] = num_list[i];
        }
        return answer;
    }
}
