package com.programmers.level1.p1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;

public class 데이터분석 {
    public static void main(String[] args) {
        int[][] data = {{1, 20300104, 100, 80}, {2, 20300804, 847, 37}, {3, 20300401, 10, 8}};
        System.out.println(Arrays.deepToString(solution(data, "date", 20300501, "remain")));
    }

    public static int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        Map<String, Integer> map = Map.of(
                "code", 0
                , "date", 1
                , "maximum", 2
                , "remain", 3
        );

        return Arrays.stream(data)
                     .filter(arr -> arr[map.get(ext)] < val_ext)
                     .sorted(Comparator.comparingInt(arr -> arr[map.get(sort_by)]))
                     .toArray(int[][]::new);
    }
}
