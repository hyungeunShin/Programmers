package com.programmers.level0_2;

public class 조건문자열 {
    public static void main(String[] args) {
        System.out.println(solution("<", "=", 20, 50));
        System.out.println(solution(">", "!", 41, 78));
    }

    public static int solution(String ineq, String eq, int n, int m) {
        if(">".equals(ineq) && "=".equals(eq)) {
            return n >= m ? 1 : 0;
        } else if("<".equals(ineq) && "=".equals(eq)) {
            return n <= m ? 1 : 0;
        } else if(">".equals(ineq) && "!".equals(eq)) {
            return n > m ? 1 : 0;
        } else if("<".equals(ineq) && "!".equals(eq)) {
            return n < m ? 1 : 0;
        }

        return 0;
    }
}
