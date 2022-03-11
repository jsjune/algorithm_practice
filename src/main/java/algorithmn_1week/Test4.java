package algorithmn_1week;

public class Test4 {
    public long solution(int a, int b) {
        long answer = 0;
        if (a < b) {
            for (int i = a; i <= b; i++) {
                answer += i;
            }
        } else if (a > b) {
            for (int i = b; i <= a; i++) {
                answer += i;
            }
        }else{
            answer = a;
        }
        return answer;
    }

    public static void main(String[] args) {
        Test4 sumNum = new Test4();
        System.out.println(sumNum.solution(3, 5));
    }
}

//class Solution {
//    public long solution(int a, int b) {
//        long answer = 0;
//        for (int i = ((a < b) ? a : b); i <= ((a < b) ? b : a); i++)
//            answer += i;
//
//        return answer;
//    }
//}
