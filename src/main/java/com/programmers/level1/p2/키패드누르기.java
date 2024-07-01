package com.programmers.level1.p2;

public class 키패드누르기 {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5}, "right"));
        System.out.println(solution(new int[] {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2}, "left"));
        System.out.println(solution(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}, "right"));
    }

    public static String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();

        int left = 10;
        int right = 12;
        for(int n : numbers) {
            if(n == 1 || n == 4 || n == 7) {
                left = n;
                answer.append("L");
            } else if(n == 3 || n == 6 || n == 9) {
                right = n;
                answer.append("R");
            } else {
                if(getDistance(left, n) > getDistance(right, n)) {
                    right = n;
                    answer.append("R");
                } else if(getDistance(left, n) < getDistance(right, n)) {
                    left = n;
                    answer.append("L");
                } else {
                    if("left".equals(hand)) {
                        left = n;
                        answer.append("L");
                    } else {
                        right = n;
                        answer.append("R");
                    }
                }
            }
        }

        return answer.toString();
    }

    public static int getDistance(int current, int target) {
        current = current == 0 ? 11 : current;
        target = target == 0 ? 11 : target;

        return Math.abs(target - current) / 3 + Math.abs(target - current) % 3;
    }

    static class Solution {
        int[][] numpadPos = {
                {3,1}, //0
                {0,0}, //1
                {0,1}, //2
                {0,2}, //3
                {1,0}, //4
                {1,1}, //5
                {1,2}, //6
                {2,0}, //7
                {2,1}, //8
                {2,2}  //9
        };

        int[] leftPos = {3,0};
        int[] rightPos = {3,2};
        String hand;

        public String solution(int[] numbers, String hand) {
            this.hand = "right".equals(hand) ? "R" : "L";

            String answer = "";
            for(int n : numbers) {
                String s = click(n);
                answer += s;

                if(s.equals("L")) {
                    leftPos = numpadPos[n];
                } else {
                    rightPos = numpadPos[n];
                }
            }
            return answer;
        }

        private String click(int num) {
            if(num == 1 || num == 4 || num == 7) {
                return "L";
            } else if(num == 3 || num == 6 || num == 9) {
                return "R";
            } else {
                if(getDist(leftPos, num) > getDist(rightPos, num)) {
                    return "R";
                } else if(getDist(leftPos, num) < getDist(rightPos, num)) {
                    return "L";
                }

                return this.hand;
            }
        }

        private int getDist(int[] pos, int num) {
            return Math.abs(pos[0] - numpadPos[num][0]) + Math.abs(pos[1] - numpadPos[num][1]);
        }
    }
}
