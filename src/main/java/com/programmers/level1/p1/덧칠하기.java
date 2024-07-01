package com.programmers.level1.p1;

public class 덧칠하기 {
    public static void main(String[] args) {
        System.out.println(solution(8, 4, new int[] {2,3,6}));
        System.out.println(solution(5, 4, new int[] {1,3}));
        System.out.println(solution(4, 1, new int[] {1,2,3,4}));
    }

    public static int solution(int n, int m, int[] section) {
        int answer = 0;

        int position = 1;
        for(int i : section) {
            if(position <= i) {
                answer++;
                position = i + m;
            }
        }

        return answer;
    }
}
