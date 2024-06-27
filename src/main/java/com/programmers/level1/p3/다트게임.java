package com.programmers.level1.p3;

public class 다트게임 {
    public static void main(String[] args) {
        System.out.println(solution("1S2D*3T"));
        System.out.println(solution("1D2S#10S"));
        System.out.println(solution("1D2S0T"));
        System.out.println(solution("1S*2T*3S"));
        System.out.println(solution("1D#2S*3S"));
        System.out.println(solution("1T2D3D#"));
        System.out.println(solution("1D2S3T*"));
    }

    public static int solution(String dartResult) {
        int[] dart = new int[3];

        int idx = -1;
        char[] arr = dartResult.toCharArray();
        for(int i = 0; i < arr.length; i++) {
            if(Character.isDigit(arr[i])) {
                idx++;
                dart[idx] = Integer.parseInt(String.valueOf(arr[i]));
                if(Character.isDigit(arr[i + 1])) {
                    dart[idx] = 10;
                    i++;
                }
            }

            switch(arr[i]) {
                case 'D':
                    dart[idx] = (int) Math.pow(dart[idx], 2);
                    break;
                case 'T':
                    dart[idx] = (int) Math.pow(dart[idx], 3);
                    break;
                case '*':
                    dart[idx] *= 2;
                    if(idx > 0) {
                        dart[idx - 1] *= 2;
                    }
                    break;
                case '#':
                    dart[idx] *= -1;
                    break;
            }
        }

        int answer = 0;
        for(int d : dart) {
            answer += d;
        }
        return answer;
    }
}
