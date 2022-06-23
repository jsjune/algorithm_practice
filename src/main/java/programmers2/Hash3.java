package programmers2;

/*
https://programmers.co.kr/learn/courses/30/lessons/42578
위장
 */

import java.util.HashMap;
import java.util.HashSet;

public class Hash3 {
    public static void main(String[] args) {
        String[][] clothes = {{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};
        System.out.println(new Hash3().solution(clothes));
    }

    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0;i<clothes.length;i++){
            map.put(clothes[i][1],map.getOrDefault(clothes[i][1],0)+1);
        }

        for(String key : map.keySet()){
            answer *= (map.get(key)+1);
        }

        return answer-1;
    }

}
