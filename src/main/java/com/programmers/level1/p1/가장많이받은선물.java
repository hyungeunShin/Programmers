package com.programmers.level1.p1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class 가장많이받은선물 {
    public static void main(String[] args) {
        String[] friends1 = {"muzi", "ryan", "frodo", "neo"};
        String[] gifts1 = {"muzi frodo", "muzi frodo", "ryan muzi", "ryan muzi", "ryan muzi", "frodo muzi", "frodo ryan", "neo muzi"};
        System.out.println(solution(friends1, gifts1));

        String[] friends2 = {"joy", "brad", "alessandro", "conan", "david"};
        String[] gifts2 = {"alessandro brad", "alessandro joy", "alessandro conan", "david alessandro", "alessandro david"};
        System.out.println(solution(friends2, gifts2));

        String[] friends3 = {"a", "b", "c"};
        String[] gifts3 = {"a b", "b a", "c a", "a c", "a c", "c a"};
        System.out.println(solution(friends3, gifts3));
    }

    public static int solution(String[] friends, String[] gifts) {
//        Map<String, Map<String, Integer>> history = new HashMap<>();    //선물내역
//        Map<String, Integer> gift = new HashMap<>();    //선물지수
//
//        for(String s : friends) {
//            gift.put(s, 0);
//
//            for(String f : friends) {
//                if(!s.equals(f)) {
//                    history.putIfAbsent(s, new HashMap<>());
//                    history.get(s).put(f, 0);
//                }
//            }
//        }
//
//        for(String s : gifts) {
//            String from = s.split(" ")[0];
//            String to = s.split(" ")[1];
//
//            //누가 누구에게 선물한 횟수
//            history.get(from).put(to, history.get(from).get(to) + 1);
//            //선물지수
//            gift.put(from, gift.get(from) + 1);
//            gift.put(to, gift.get(to) - 1);
//        }
//
//        Map<String, Integer> map = new HashMap<>(); //누가 몇개의 선물을 받을지
//        for(String s : friends) {
//            for(String f : friends) {
//                if(!s.equals(f)) {
//                    int forward = history.get(s).get(f);
//                    int reverse = history.get(f).get(s);
//
//                    if(forward > reverse) {
//                        map.put(s, map.getOrDefault(s, 0) + 1);
//                    } else if(forward == reverse) {
//                        if(gift.get(s) > gift.get(f)) {
//                            map.put(s, map.getOrDefault(s, 0) + 1);
//                        }
//                    }
//                }
//            }
//        }
//        return map.values().stream().max(Comparator.naturalOrder()).orElse(0);

//        Map<String, Integer> map = new HashMap<>();
//        for(int i = 0; i < friends.length; i++) {
//            map.put(friends[i], i);
//        }
//        int[] index = new int[friends.length];
//        int[][] record = new int[friends.length][friends.length];
//
//        for(String str : gifts) {
//            String[] cur = str.split(" ");
//            index[map.get(cur[0])]++;
//            index[map.get(cur[1])]--;
//            record[map.get(cur[0])][map.get(cur[1])]++;
//        }
//
//        int ans = 0;
//        for(int i = 0; i < friends.length; i++) {
//            int cnt = 0;
//            for(int j = 0; j < friends.length; j++) {
//                if(i == j) {
//                    continue;
//                }
//
//                if(record[i][j] > record[j][i]) {
//                    cnt++;
//                } else if(record[i][j] == record[j][i] && index[i] > index[j]) {
//                    cnt++;
//                }
//            }
//            ans = Math.max(cnt, ans);
//        }
//        return ans;

        int n = friends.length;
        int[][] history = new int[n][n]; //주고 받은 선물 내역 저장
        int[] giftScore = new int[n]; //선물 지수 저장
        int[] nextMonthGift = new int[n]; //다음달 받는 선물의 수 저장

        HashMap<String, Integer> friendIdx = new HashMap<>(); //친구들의 index를 저장
        for(int i = 0; i < n; i++) {
            friendIdx.put(friends[i], i);
        }

        for(String gift : gifts) {
            String[] tmp = gift.split(" ");
            int giverIdx = friendIdx.get(tmp[0]);
            int takerIdx = friendIdx.get(tmp[1]);

            //선물을 주고 받은 내역 기록
            history[giverIdx][takerIdx]++;

            //선물 지수를 계산
            giftScore[giverIdx]++;
            giftScore[takerIdx]--;
        }

        //history 배열은 주고 받은 관계가 i와 j가 대칭을 이루므로 절반만 반복하면 된다.
        for(int giver = 0; giver < n; giver++) {
            for(int taker = giver + 1; taker < n; taker++) {
                int give = history[giver][taker];
                int take = history[taker][giver];

                //주고 받은 선물 계산
                if(give > take) {
                    nextMonthGift[giver]++;
                } else if(give < take) {
                    nextMonthGift[taker]++;
                } else {
                    //주고 받은 기록이 없거나 주고 받은 수가 같은 경우 선물 지수를 비교한다.
                    if(giftScore[giver] > giftScore[taker]) {
                        nextMonthGift[giver]++;
                    } else if(giftScore[giver] < giftScore[taker]) {
                        nextMonthGift[taker]++;
                    }
                }
            }
        }

        return Arrays.stream(nextMonthGift)
                     .max()
                     .orElse(0);
    }
}
