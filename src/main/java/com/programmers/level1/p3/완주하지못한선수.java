package com.programmers.level1.p3;

import java.util.HashMap;
import java.util.Map;

public class 완주하지못한선수 {
    public static void main(String[] args) {
        System.out.println(solution(new String[] {"leo", "kiki", "eden"}, new String[] {"eden", "kiki"}));
        System.out.println(solution(new String[] {"marina", "josipa", "nikola", "vinko", "filipa"}, new String[] {"josipa", "filipa", "marina", "nikola"}));
        System.out.println(solution(new String[] {"mislav", "stanko", "mislav", "ana"}, new String[] {"stanko", "ana", "mislav"}));
    }

    public static String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();

        for(String p : participant) {
            map.put(p, map.getOrDefault(p, 0) + 1);
        }

        for(String c : completion) {
            map.put(c, map.get(c) - 1);
        }

        String answer = "";
        for(Map.Entry<String, Integer> e : map.entrySet()) {
            if(e.getValue() != 0) {
                answer = e.getKey();
                break;
            }
        }
        return answer;
    }
}
