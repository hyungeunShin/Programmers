package com.programmers.level1.p1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 달리기경주 {
    public static void main(String[] args) {
        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"kai", "kai", "mine", "mine"};
        System.out.println(Arrays.toString(solution(players, callings)));
    }

    public static String[] solution(String[] players, String[] callings) {
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < players.length; i++) {
            map.put(players[i], i);
        }

        for(String c : callings) {
            int rank = map.get(c);

            String front = players[rank - 1];
            players[rank] = front;
            map.replace(front, rank);

            players[rank - 1] = c;
            map.replace(c, rank - 1);
        }

        return players;
    }
}
