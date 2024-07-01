package com.programmers.level1.p1;

public class 푸드파이트대회 {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {1,3,4,6}));
        System.out.println(solution(new int[] {1,7,1,2}));
    }

    public static String solution(int[] food) {
//        StringBuilder sb = new StringBuilder();
//
//        for(int i = 1; i < food.length; i++) {
//            int cnt = food[i] / 2;
//            sb.append(String.valueOf(i).repeat(cnt));
//        }
//
//        String answer = sb.toString();
//        String reverse = sb.reverse().toString();
//        return answer + "0" + reverse;

        StringBuilder answer = new StringBuilder("0");
        for(int i = food.length - 1; i > 0; i--) {
            for(int j = 0; j < food[i] / 2; j++) {
                answer = new StringBuilder(i + answer.toString() + i);
            }
        }
        return answer.toString();
    }
}
