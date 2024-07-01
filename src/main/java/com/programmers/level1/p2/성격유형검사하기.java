package com.programmers.level1.p2;

import java.util.HashMap;

public class 성격유형검사하기 {
    public static void main(String[] args) {
        System.out.println(solution(new String[] {"AN", "CF", "MJ", "RT", "NA"}, new int[] {5, 3, 2, 7, 5}));
        System.out.println(solution(new String[] {"TR", "RT", "TR"}, new int[] {7, 1, 3}));
    }

    public static String solution(String[] survey, int[] choices) {
        char[] type = {'R', 'T', 'C', 'F', 'J', 'M', 'A', 'N'};
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : type) {
            map.put(c, 0);
        }

        for(int i = 0; i < survey.length; i++) {
            int score = choices[i];

            if(score > 4) {
                map.put(survey[i].charAt(1), map.get(survey[i].charAt(1)) + score - 4);
            } else {
                map.put(survey[i].charAt(0), map.get(survey[i].charAt(0)) + 4 - score);
            }
        }

        String answer = map.get('R') >= map.get('T') ? "R" : "T";
        answer += map.get('C') >= map.get('F') ? "C" : "F";
        answer += map.get('J') >= map.get('M') ? "J" : "M";
        answer += map.get('A') >= map.get('N') ? "A" : "N";
        return answer;
    }
}
