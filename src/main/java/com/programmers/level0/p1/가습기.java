package com.programmers.level0.p1;

public class 가습기 {
    public static void main(String[] args) {
        System.out.println(solution("auto", 23, 45));
    }

    public static int func1(int humidity, int val_set) {
        if(humidity < val_set)
            return 3;
        return 1;
    }

    public static int func2(int humidity) {
        if(humidity >= 50)
            return 0;
        else if(humidity >= 40)
            return 1;
        else if(humidity >= 30)
            return 2;
        else if(humidity >= 20)
            return 3;
        else if(humidity >= 10)
            return 4;
        else return 5;
    }

    public static int func3(int humidity, int val_set) {
        if(humidity < val_set)
            return 1;
        return 0;
    }

    public static int solution(String mode_type, int humidity, int val_set) {
        int answer = 0;

        if("auto".equals(mode_type)) {
            answer = func2(humidity);
        } else if("target".equals(mode_type)) {
            answer = func1(humidity, val_set);
        } else if("minimum".equals(mode_type)) {
            answer = func3(humidity, val_set);
        }

        return answer;
    }
}
