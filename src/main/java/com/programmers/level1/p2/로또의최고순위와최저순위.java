package com.programmers.level1.p2;

import java.util.Arrays;
import java.util.stream.LongStream;

public class 로또의최고순위와최저순위 {
    public static void main(String[] args) {
        int[] lottos1 = {44, 1, 0, 0, 31, 25};
        int[] lottos2 = {0, 0, 0, 0, 0, 0};
        int[] lottos3 = {45, 4, 35, 20, 3, 9};

        int[] win_nums1 = {31, 10, 45, 1, 6, 19};
        int[] win_nums2 = {38, 19, 20, 40, 15, 25};
        int[] win_nums3 = {20, 9, 3, 45, 4, 35};

        System.out.println(Arrays.toString(solution(lottos1, win_nums1)));
        System.out.println(Arrays.toString(solution(lottos2, win_nums2)));
        System.out.println(Arrays.toString(solution(lottos3, win_nums3)));
    }

    public static int[] solution(int[] lottos, int[] win_nums) {
//        int zero = 0;
//        int correct = 0;
//        for(int i : lottos) {
//            if(i == 0) {
//                zero++;
//            }
//
//            for(int j : win_nums) {
//                if(i == j) {
//                    correct++;
//                    break;
//                }
//            }
//        }
//
//        int[] arr = {6,6,5,4,3,2,1};
//        return new int[] {arr[zero + correct], arr[correct]};

        return LongStream.of(
                        (lottos.length + 1) - Arrays.stream(lottos).filter(l -> Arrays.stream(win_nums).anyMatch(w -> w == l) || l == 0).count(),
                        (lottos.length + 1) - Arrays.stream(lottos).filter(l -> Arrays.stream(win_nums).anyMatch(w -> w == l)).count()
                )
                .mapToInt(op -> (int) (op > 6 ? op - 1 : op))
                .toArray();
    }
}
