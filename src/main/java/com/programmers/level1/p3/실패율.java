package com.programmers.level1.p3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class 실패율 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(5, new int[] {2, 1, 2, 6, 2, 4, 3, 3})));
        System.out.println(Arrays.toString(solution(4, new int[] {4,4,4,4,4})));
    }

    public static int[] solution(int N, int[] stages) {
        int[] fail = new int[N + 1];
        int[] total = new int[N + 1];

        for(int i = 0; i < stages.length; i++) {
            for(int j = 0; j < stages[i]; j++) {
                total[j]++;
            }
            fail[stages[i] - 1]++;
        }

        Map<Integer, Double> map = new HashMap<>();
        for(int i = 0; i < total.length; i++) {
            if(total[i] == 0) {
                map.put(i, 0.0);
            } else {
                map.put(i, (double) fail[i] / total[i]);
            }
        }

        return map.entrySet().stream()
                  .limit(N)
                  .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                  .map(Map.Entry::getKey)
                  .mapToInt(i -> i + 1)
                  .toArray();
    }
}
