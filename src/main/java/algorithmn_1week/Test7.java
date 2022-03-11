package algorithmn_1week;

import java.security.KeyStore;

public class Test7 {
    public int solution(int[] absolutes, boolean[] signs) {
        int num=0;
        for (int i = 0; i < signs.length; i++) {
            if (signs[i]) {
                num += absolutes[i];
            } else {
                num -= absolutes[i];
            }
        }
        return num;
    }

    public static void main(String[] args) {
        Test7 def = new Test7();
        int[] num = new int[] {4,7,12};
        boolean[] signs = new boolean[] {true,false,true};
        System.out.println(def.solution(num,signs));
//        System.out.println(signs[0]);
    }
}

//class Solution {
//    public int solution(int[] absolutes, boolean[] signs) {
//        int answer = 0;
//        for (int i=0; i<signs.length; i++)
//            answer += absolutes[i] * (signs[i]? 1: -1);
//        return answer;
//    }
//}
