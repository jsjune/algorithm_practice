package algorithmn;

import java.util.Arrays;

public class Test23 {
    public long[] solution(long n) {
        long temp = n;
        int cnt=0;
        while(temp!=0){
            cnt++;
            temp/=10;
        }
        long[] answer = new long[cnt];
        temp=n;
        for(int i=0; i<answer.length; i++){
            answer[i]=temp%10;
            temp/=10;
        }
        return answer;
    }

    public static void main(String[] args) {
        int n = 12345;
        String s = String.valueOf(n);
        StringBuilder sb = new StringBuilder(s);
        sb = sb.reverse();
        System.out.println(sb);
        String[] ss = sb.toString().split("");
        System.out.println(Arrays.toString(ss));
    }
}


