package com.programmers.level0.p10;

import java.math.BigInteger;

public class 구슬을나누는경우 {
    public static void main(String[] args) {
        System.out.println(solution(3, 2));
        System.out.println(solution(5, 3));

        System.out.println(solution2(3, 2));
        System.out.println(solution2(5, 3));
    }

    public static int solution(int balls, int share) {
        BigInteger n = new BigInteger("1");
        BigInteger m = new BigInteger("1");

        for(int i = balls - share + 1; i <= balls; i++) {
            n = n.multiply(BigInteger.valueOf(i));
        }

        for(int i = 2; i <= share; i++) {
            m = m.multiply(BigInteger.valueOf(i));
        }

        return n.divide(m).intValue();
    }

    public static long solution2(int balls, int share) {
        share = Math.min(balls - share, share);

        if(share == 0) {
            return 1;
        }

        long result = solution2(balls - 1, share - 1);
        result *= balls;
        result /= share;

        return result;
    }
}
