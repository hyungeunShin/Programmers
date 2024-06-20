package com.programmers.level0.p6;

import java.util.Arrays;

public class 배열의원소삭제 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[] {293, 1000, 395, 678, 94}, new int[] {94, 777, 104, 1000, 1, 12})));
        System.out.println(Arrays.toString(solution(new int[] {110, 66, 439, 785, 1}, new int[] {377, 823, 119, 43})));
    }

    public static int[] solution(int[] arr, int[] delete_list) {
//        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
//
//        for(int i : delete_list) {
//            int index = list.indexOf(i);
//            if(index != -1) {
//                list.remove(index);
//            }
//        }
//
//        return list.stream().mapToInt(i -> i).toArray();

        return Arrays.stream(arr)
                     .filter(i -> Arrays.stream(delete_list).noneMatch(s -> s == i))
                     .toArray();
    }
}
