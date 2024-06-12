package com.programmers.level0_3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class 주사위게임3 {
    public static void main(String[] args) {
        System.out.println(solution(2,2,2,2));
        System.out.println(solution(4,1,4,4));
        System.out.println(solution(6,3,3,6));
        System.out.println(solution(2,5,2,6));
        System.out.println(solution(6,4,2,5));
    }

    public static int solution(int a, int b, int c, int d) {
//        Map<Integer, Integer> map = new HashMap<>();
//        map.put(a, map.getOrDefault(a, 0) + 1);
//        map.put(b, map.getOrDefault(b, 0) + 1);
//        map.put(c, map.getOrDefault(c, 0) + 1);
//        map.put(d, map.getOrDefault(d, 0) + 1);
//
//        if(map.size() == 1) {
//            return a * 1111;
//        } else if(map.size() == 2) {
//            int p = 0;
//            int q = 0;
//
//            if(map.containsValue(3)) {
//                for(Map.Entry<Integer, Integer> e : map.entrySet()) {
//                    if(e.getValue() == 3) {
//                        p = e.getKey();
//                    }
//
//                    if(e.getValue() == 1) {
//                        q = e.getKey();
//                    }
//                }
//
//                return (int) Math.pow(10 * p + q, 2);
//            } else {
//                Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();
//                p = iterator.next().getKey();
//                q = iterator.next().getKey();
//
//                return (p + q) * Math.abs(p - q);
//            }
//        } else if(map.size() == 3) {
//            int answer = 1;
//
//            for(Map.Entry<Integer, Integer> e : map.entrySet()) {
//                if(e.getValue() != 2) {
//                    answer *= e.getKey();
//                }
//            }
//            return answer;
//        } else {
//            return Math.min(Math.min(a, b), Math.min(c, d));
//        }

        int[] dice = { a, b, c, d };
        Arrays.sort(dice);

        int ans = 0;

        if (dice[0] == dice[3]) {
            ans = 1111 * dice[3];
        } else if (dice[0] == dice[2] || dice[1] == dice[3]) {
            ans = (int) Math.pow(dice[1] * 10 + (dice[0] + dice[3] - dice[1]), 2);
        } else if (dice[0] == dice[1] && dice[2] == dice[3]) {
            ans = (dice[0] + dice[3]) * (dice[3] - dice[0]);
        } else if (dice[0] == dice[1]) {
            ans = dice[2] * dice[3];
        } else if (dice[1] == dice[2]) {
            ans = dice[0] * dice[3];
        } else if (dice[2] == dice[3]) {
            ans = dice[0] * dice[1];
        } else {
            ans = dice[0];
        }

        return ans;
    }
}
