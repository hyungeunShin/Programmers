package com.programmers.level1.p5;

import java.util.HashSet;

public class 폰켓몬 {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {3,1,2,3}));
        System.out.println(solution(new int[] {3,3,3,2,2,4}));
        System.out.println(solution(new int[] {3,3,3,2,2,2}));
    }

    public static int solution(int[] nums) {
//        int[] arr = Arrays.stream(nums).distinct().toArray();
//        return Math.min(nums.length / 2, arr.length);

//        return Arrays.stream(nums)
//                .boxed()
//                .collect(Collectors.collectingAndThen(Collectors.toSet(),
//                        set -> Integer.min(set.size(), nums.length / 2)));

        HashSet<Integer> set = new HashSet<>();
        for(int num : nums) {
            set.add(num);
        }
        return Math.min(set.size(), nums.length / 2);
    }
}
