package com.programmers.level1.p1;

import java.util.Arrays;

public class 공원산책 {
    public static void main(String[] args) {
        String[] park1 = {"SOO","OOO","OOO"};
        String[] park2 = {"SOO","OXX","OOO"};
        String[] routes1 = {"E 2","S 2","W 1"};

        String[] park3 = {"OSO","OOO","OXO","OOO"};
        String[] routes2 = {"E 2","S 3","W 1"};

        System.out.println(Arrays.toString(solution(park1, routes1)));
        System.out.println(Arrays.toString(solution(park2, routes1)));
        System.out.println(Arrays.toString(solution(park3, routes2)));
    }

    public static int[] solution(String[] park, String[] routes) {
        int sx = 0;
        int sy = 0;

        for(int i = 0; i < park.length; i++) {
            if(park[i].contains("S")) {
                sx = park[i].indexOf("S");
                sy = i;
                break;
            }
        }

        for(String s : routes) {
            String d = s.split(" ")[0];
            int m = Integer.parseInt(s.split(" ")[1]);

            int x = sx;
            int y = sy;

            boolean canMove = true;

            for(int i = 0; i < m; i++) {
                if("E".equals(d)) {
                    x++;
                } else if("W".equals(d)) {
                    x--;
                } else if("S".equals(d)) {
                    y++;
                } else {
                    y--;
                }

                if(x < 0 || y < 0 || x >= park[0].length() || y >= park.length || park[y].charAt(x) == 'X') {
                    canMove = false;
                    break;
                }
            }

            if(canMove) {
                sx = x;
                sy = y;
            }
        }

        return new int[] {sy, sx};
    }
}
