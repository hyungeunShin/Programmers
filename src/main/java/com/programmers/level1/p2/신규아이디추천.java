package com.programmers.level1.p2;

public class 신규아이디추천 {
    public static void main(String[] args) {
        System.out.println(solution("...!@BaT#*..y.abcdefghijklm"));
        System.out.println(solution("z-+.^."));
        System.out.println(solution("=.="));
        System.out.println(solution("123_.def"));
        System.out.println(solution("abcdefghijklmn.p"));
    }

    public static String solution(String new_id) {
        //1단계
        new_id = new_id.toLowerCase();
        //2단계
        new_id = new_id.replaceAll("[^a-z0-9._-]+", "");
        //3단계
        new_id = new_id.replaceAll("[.]{2,}", ".");
        //4단계
        new_id = new_id.replaceAll("^[.]|[.]$", "");
        //5단계
        if(new_id.isEmpty()) {
            new_id = "a";
        }
        //6단계
        if(new_id.length() >= 16) {
            new_id = new_id.substring(0, 15);
            new_id = new_id.replaceAll("[.]$", "");
        }
        //7단계
        if(new_id.length() <= 2) {
            char c = new_id.charAt(new_id.length() - 1);
            while(new_id.length() < 3) {
                new_id += c;
            }
        }
        return new_id;
    }
}
