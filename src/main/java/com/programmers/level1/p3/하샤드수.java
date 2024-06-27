package com.programmers.level1.p3;

public class 하샤드수 {
    public static void main(String[] args) {
        System.out.println(solution(10));
        System.out.println(solution(12));
        System.out.println(solution(11));
        System.out.println(solution(13));
    }

    public static boolean solution(int x) {
        int sum = String.valueOf(x)
                        .chars()
                        .map(Character::getNumericValue)
                        .sum();

        return x % sum == 0;
    }
}
