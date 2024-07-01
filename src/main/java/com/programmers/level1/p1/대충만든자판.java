package com.programmers.level1.p1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 대충만든자판 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[] {"ABACD", "BCEFD"}, new String[] {"ABCD", "AABB"})));
        System.out.println(Arrays.toString(solution(new String[] {"AA"}, new String[] {"B"})));
        System.out.println(Arrays.toString(solution(new String[] {"AGZ", "BSSS"}, new String[] {"ASA","BGZ"})));
    }

    public static int[] solution(String[] keymap, String[] targets) {
        Map<String, Integer> map = new HashMap<>();
        for(String s : keymap) {
            for(int i = 0; i < s.length(); i++) {
                String c = String.valueOf(s.charAt(i));
                Integer j = map.getOrDefault(c, i + 1);
                map.put(c, Math.min(j, i + 1));
            }
        }

        int[] answer = new int[targets.length];
        for(int i = 0; i < targets.length; i++) {
            for(String a : targets[i].split("")) {
                if(map.containsKey(a)) {
                    answer[i] += map.get(a);
                } else {
                    answer[i] = -1;
                    break;
                }
            }
        }
        return answer;
    }
}