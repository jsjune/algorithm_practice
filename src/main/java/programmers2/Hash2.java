package programmers2;

/*
https://programmers.co.kr/learn/courses/30/lessons/42577
전화번호 목록
 */

import java.util.HashMap;

public class Hash2 {
    public static void main(String[] args) {
        String[] phone_book = {"119", "97674223", "1195524421"};
        String[] phone_book2 = {"123","456","789"};
        Hash2 sol = new Hash2();
        System.out.println(sol.solution(phone_book2));

    }

    public boolean solution(String[] phone_book) {
        boolean answer = true;
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < phone_book.length; i++) {
            map.put(phone_book[i], i);
        }
        for (int i = 0; i < map.size(); i++) {
            for (int j = 1; j < phone_book[i].length(); j++) {
                if (map.containsKey(phone_book[i].substring(0, j))) {
                    return false;
                }
            }
        }
        return answer;
    }
}
