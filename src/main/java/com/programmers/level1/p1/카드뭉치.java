package com.programmers.level1.p1;

public class 카드뭉치 {
    public static void main(String[] args) {
        String[] cards1 = {"i", "drink", "water"};
        String[] cards2 = {"want", "to"};
        String[] goal1 = {"i", "want", "to", "drink", "water"};

        String[] cards3 = {"i", "water", "drink"};
        String[] cards4 = {"want", "to"};
        String[] goal2 = {"i", "want", "to", "drink", "water"};

        System.out.println(solution(cards1, cards2, goal1));
        System.out.println(solution(cards3, cards4, goal2));
    }

    public static String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        int idx1 = 0;
        int idx2 = 0;
        for(String s : goal) {
            if(idx1 < cards1.length && s.equals(cards1[idx1])) {
                ++idx1;
            } else if(idx2 < cards2.length && s.equals(cards2[idx2])) {
                ++idx2;
            } else {
                return "No";
            }
        }
        return answer;
    }
}
