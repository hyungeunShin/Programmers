package com.programmers.level0.p9;

public class 평행 {
    public static void main(String[] args) {
        System.out.println(solution(new int[][] {{1, 4}, {9, 2}, {3, 8}, {11, 6}}));
        System.out.println(solution(new int[][] {{3, 5}, {4, 1}, {2, 4}, {5, 10}}));
    }

    public static int solution(int[][] dots) {
//        int answer = 0;
//        int x1 = dots[0][0];
//        int y1 = dots[0][1];
//        int x2 = dots[1][0];
//        int y2 = dots[1][1];
//        int x3 = dots[2][0];
//        int y3 = dots[2][1];
//        int x4 = dots[3][0];
//        int y4 = dots[3][1];
//
//        double slope1 = (double) (y2 - y1) / (x2 - x1);
//        double slope2 = (double) (y4 - y3) / (x4 - x3);
//        if(slope1 == slope2) {
//            answer = 1;
//        }
//
//        double slope3 = (double) (y3 - y1) / (x3 - x1);
//        double slope4 = (double) (y2 - y4) / (x2 - x4);
//        if(slope3 == slope4) {
//            answer = 1;
//        }
//
//        double slope5 = (double) (y4 - y1) / (x4 - x1);
//        double slope6 = (double) (y2 - y3) / (x2 - x3);
//        if(slope5 == slope6) {
//            answer = 1;
//        }
//
//        return answer;

        int[][] cases = {{0, 1, 2, 3}, {0, 2, 1, 3}, {0, 3, 1, 2}};
        for(int[] c : cases) {
            if(parallel(c[0], c[1], c[2], c[3], dots)) {
                return 1;
            }
        }

        return 0;
    }

    public static boolean parallel(int a, int b, int c, int d, int[][] dots) {
        int x = (dots[a][0] - dots[b][0]) * (dots[c][1] - dots[d][1]);
        int y = (dots[a][1] - dots[b][1]) * (dots[c][0] - dots[d][0]);
        return x == y || x == -y;
    }
}
