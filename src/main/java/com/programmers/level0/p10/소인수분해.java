package com.programmers.level0.p10;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class 소인수분해 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(12)));
        System.out.println(Arrays.toString(solution(17)));
        System.out.println(Arrays.toString(solution(420)));
    }

    public static int[] solution(int n) {
        Set<Integer> set = new HashSet<>();

        for(int i = 2; i <= n; i++) {
            while(n % i == 0) {
                set.add(i);
                n /= i;
            }
        }

        return set.stream().mapToInt(Integer::intValue).sorted().toArray();
    }
}
