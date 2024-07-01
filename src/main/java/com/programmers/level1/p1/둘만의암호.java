package com.programmers.level1.p1;

import java.util.ArrayList;

public class 둘만의암호 {
    public static void main(String[] args) {
        System.out.println(solution("aukks", "wbqd", 5));
    }

    public static String solution(String s, String skip, int index) {
//        ArrayList<Character> list = new ArrayList<>();
//        for(char c = 'a'; c <= 'z'; c++) {
//            list.add(c);
//        }
//        for(char c : skip.toCharArray()) {
//            list.remove(Character.valueOf(c));
//        }
//
//        String answer = "";
//        for(char c : s.toCharArray()) {
//            int i = list.indexOf(c) + index;
//            i = i % list.size();
//            answer += list.get(i);
//        }
//        return answer;

        StringBuilder answer = new StringBuilder();
        for(char c : s.toCharArray()) {
            for(int i = 0; i < index; i++) {
                c += 1;
                if(c > 'z') {
                    c -= 26;
                }
                if(skip.contains(String.valueOf(c))) {
                    i--;
                }
            }
            answer.append(c);
        }
        return answer.toString();
    }
}
