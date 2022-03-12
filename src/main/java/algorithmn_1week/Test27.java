package algorithmn_1week;

public class Test27 {
    public int solution(int num) {
        int answer = 0;
        return answer;
    }

    public static void main(String[] args) {
        int num = 626331;
        long a = num;
        int cnt = 0;
        while(a!=1){
            cnt++;
            if (cnt>500) {
                cnt=-1;
                break;
            }
            if (a % 2 == 0) {
                a = a / 2;
            } else {
                a = a * 3 + 1;
            }
        }
        System.out.println(cnt);
    }
}
