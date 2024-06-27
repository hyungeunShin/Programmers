package com.programmers.level1.p3;

public class 핸드폰번호가리기 {
    public static void main(String[] args) {
        System.out.println(solution("01033334444"));
        System.out.println(solution("027778888"));
    }

    public static String solution(String phone_number) {
//        StringBuilder sb = new StringBuilder();
//        sb.append("*".repeat(phone_number.length() - 4));
//        return sb.toString().concat(phone_number.substring(phone_number.length() - 4));

        return phone_number.replaceAll(".(?=.{4})", "*");
    }
}
