package programmers;

import java.util.ArrayList;

public class Test29 {
    public int solution(int n) {
        int answer = 0;
        return answer;
    }

    public static void main(String[] args) {
        Test29 ans = new Test29();
//        System.out.println(ans.solution(45));
        int n = 45;
        ArrayList<Integer> list = new ArrayList<>();
        while (n != 0) {
            list.add(n%3);
            n=n/3;
        }
        int dec = 0;
        for (int i = 0; i < list.size(); i++) {
            dec += list.get(i) * Math.pow(3,list.size()-i-1);
        }
        System.out.println(dec);

    }
}
