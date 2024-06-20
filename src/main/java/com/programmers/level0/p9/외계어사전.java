package com.programmers.level0.p9;

public class 외계어사전 {
    public static void main(String[] args) {
        System.out.println(solution(new String[] {"p", "o", "s"}, new String[] {"sod", "eocd", "qixm", "adio", "soo"}));
        System.out.println(solution(new String[] {"z", "d", "x"}, new String[] {"def", "dww", "dzx", "loveaw"}));
        System.out.println(solution(new String[] {"s", "o", "m", "d"}, new String[] {"moos", "dzx", "smm", "sunmmo", "som"}));
    }

    public static int solution(String[] spell, String[] dic) {
        int answer = 2;
        for(String d : dic) {
            int cnt = 0;
            for(String s : spell) {
                if(d.contains(s)) {
                    cnt++;
                }
            }

            if(spell.length == cnt) {
                answer = 1;
                break;
            }
        }
        return answer;
    }
}
