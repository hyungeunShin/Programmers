package com.programmers.level1.p3;

import java.util.Arrays;

public class 예산 {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {1,3,2,5,4}, 9));
        System.out.println(solution(new int[] {2,2,3,3}, 10));
    }

    public static int solution(int[] d, int budget) {
        Arrays.sort(d);

        int answer = 0;
        for(int n : d) {
            budget -= n;
            if(budget < 0) {
                break;
            }
            answer++;
        }
        return answer;
    }
}
