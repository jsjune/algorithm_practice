package programmers;
////////////////////////////////////////////////////////////////
import java.util.Arrays;
public class Test11 {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        for(int i=0;i<n;i++){
            answer[i]=(long)x*(i+1);
        }
        return answer;
    }

    public static void main(String[] args) {
        Test11 num = new Test11();

        System.out.println(Arrays.toString(num.solution(-4,2)));
    }
}
