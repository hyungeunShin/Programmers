package com.programmers.level1.p3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class 체육복 {
    public static void main(String[] args) {
//        System.out.println(solution(5, new int[] {2,4}, new int[] {1,3,5}));
        System.out.println(solution(5, new int[] {2,4}, new int[] {3}));
//        System.out.println(solution(3, new int[] {3}, new int[] {1}));

//        System.out.println(solution(5, new int[] {2,4}, new int[] {1,2}));
    }

    public static int solution(int n, int[] lost, int[] reserve) {
//        Set<Integer> reserveSet = Arrays.stream(reserve).boxed().collect(Collectors.toSet());
//
//        Set<Integer> lostSet = new HashSet<>();
//        for(int i : lost) {
//            if(reserveSet.contains(i)) {
//                reserveSet.remove(i);
//            } else {
//                lostSet.add(i);
//            }
//        }
//
//        reserveSet.forEach(i -> {
//            if(lostSet.contains(i - 1)) {
//                lostSet.remove(i - 1);
//            } else if(lostSet.contains(i + 1)) {
//                lostSet.remove(i + 1);
//            }
//        });
//
//        return n - lostSet.size();

//        int answer = n - lost.length;
//
//        Arrays.sort(reserve);
//        Arrays.sort(lost);
//
//        for(int i = 0; i < lost.length; i++) {
//            for(int j = 0; j < reserve.length; j++) {
//                if(lost[i] == reserve[j]) {
//                    answer++;
//                    lost[i] = -1;
//                    reserve[j] = -1;
//                    break;
//                }
//            }
//        }
//
//        for(int i = 0; i < lost.length; i++) {
//            for(int j = 0; j < reserve.length; j++) {
//                if(lost[i] - 1 == reserve[j] || lost[i] + 1 == reserve[j]) {
//                    answer++;
//                    reserve[j] = -1;
//                    break;
//                }
//            }
//        }
//
//        return answer;

        int[] people = new int[n];
        int answer = n;

        for(int l : lost) {
            people[l - 1]--;
        }

        for(int r : reserve) {
            people[r - 1]++;
        }

        System.out.println(Arrays.toString(people));

        for(int i = 0; i < people.length; i++) {
            if(people[i] == -1) {
                if(i - 1 >= 0 && people[i - 1] == 1) {
                    people[i]++;
                    people[i - 1]--;
                } else if(i + 1 < people.length && people[i + 1] == 1) {
                    people[i]++;
                    people[i + 1]--;
                } else {
                    answer--;
                }
            }
        }
        System.out.println(Arrays.toString(people));
        return answer;
    }
}
