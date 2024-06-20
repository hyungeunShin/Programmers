package com.programmers.level0.p9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class 등수매기기 {
    public static void main(String[] args) {
        int[][] score1 = {{80, 70}, {90, 50}, {40, 70}, {50, 80}};
        int[][] score2 = {{80, 70}, {70, 80}, {30, 50}, {90, 100}, {100, 90}, {100, 100}, {10, 30}};

        System.out.println(Arrays.toString(solution(score1)));
        System.out.println(Arrays.toString(solution(score2)));
    }

    public static int[] solution(int[][] score) {
//        int[] sum = new int[score.length];
//        for(int i = 0; i < score.length; i++) {
//            sum[i] = score[i][0] + score[i][1];
//        }
//
//        int[] answer = new int[sum.length];
//        for(int i = 0; i < sum.length; i++) {
//            answer[i]++;
//            for(int j = 0; j < sum.length; j++) {
//                if(sum[i] < sum[j]) {
//                    answer[i]++;
//                }
//            }
//        }
//
//        return answer;

        List<Integer> list = new ArrayList<>();
        for(int[] a : score) {
            list.add(a[0] + a[1]);
        }
        list.sort(Comparator.reverseOrder());

        int[] answer = new int[score.length];
        for(int i = 0; i < score.length; i++) {
            answer[i] = list.indexOf(score[i][0] + score[i][1]) + 1;
        }
        return answer;
    }
}
