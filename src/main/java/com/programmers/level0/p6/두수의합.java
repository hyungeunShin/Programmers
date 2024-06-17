package com.programmers.level0.p6;

import java.math.BigInteger;

public class 두수의합 {
    public static void main(String[] args) {
        System.out.println(solution("582", "734"));
        System.out.println(solution("18446744073709551615", "287346502836570928366"));
        System.out.println(solution("0", "0"));
    }

    public static String solution(String a, String b) {
        BigInteger aa = new BigInteger(a);
        BigInteger bb = new BigInteger(b);

//        return String.valueOf(aa.add(bb));

        return aa.add(bb).toString();
    }
}
