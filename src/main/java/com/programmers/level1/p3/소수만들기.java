package com.programmers.level1.p3;

import java.util.ArrayList;
import java.util.List;

public class 소수만들기 {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {1,2,3,4}));
        System.out.println(solution(new int[] {1,2,7,6,4}));
    }

    public static int solution(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                for(int k = j + 1; k < nums.length; k++) {
                    list.add(nums[i] + nums[j] + nums[k]);
                }
            }
        }

        int answer = 0;
        for(int n : list) {
            if(isPrime(n)) {
                answer++;
            }
        }
        return answer;
    }

    private static boolean isPrime(int n) {
        if(n <= 1) {
            return false;
        }

        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
