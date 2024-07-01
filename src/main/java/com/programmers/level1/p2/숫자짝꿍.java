package com.programmers.level1.p2;

import java.util.HashMap;
import java.util.Map;

public class 숫자짝꿍 {
    public static void main(String[] args) {
        System.out.println(solution("100", "2345"));
        System.out.println(solution("100", "203045"));
        System.out.println(solution("100", "123450"));
        System.out.println(solution("12321", "42531"));
        System.out.println(solution("5525", "1255"));
    }

    public static String solution(String X, String Y) {
//        Map<Integer, Integer> map1 = new HashMap<>();
//        Map<Integer, Integer> map2 = new HashMap<>();
//        for(String s : X.split("")) {
//            int x = Integer.parseInt(s);
//            map1.put(x, map1.getOrDefault(x, 0) + 1);
//        }
//
//        for(String s : Y.split("")) {
//            int y = Integer.parseInt(s);
//            map2.put(y, map2.getOrDefault(y, 0) + 1);
//        }
//
//        StringBuilder sb = new StringBuilder();
//        for(int i = 0; i < 10; i++) {
//            if(map1.containsKey(i) && map2.containsKey(i)) {
//                int min = Math.min(map1.get(i), map2.get(i));
//                sb.append(String.valueOf(i).repeat(min));
//            }
//        }
//
//        String answer = sb.reverse().toString();
//        if(answer.startsWith("0")) {
//            return "0";
//        } else if(answer.isEmpty()) {
//            return "-1";
//        } else {
//            return answer;
//        }

        int[] xArr = new int[10];
        int[] yArr = new int[10];

        for(char c : X.toCharArray()) {
            xArr[c - 48]++;
        }

        for(char c : Y.toCharArray()) {
            yArr[c - 48]++;
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 9; i >= 0; i--) {
            if(xArr[i] > 0 && yArr[i] > 0) {
                sb.append(String.valueOf(i).repeat(Math.min(xArr[i], yArr[i])));
            }
        }

        if(sb.toString().startsWith("0")) {
            return "0";
        } else if(sb.toString().isEmpty()) {
            return "-1";
        } else {
            return sb.toString();
        }
    }
}
