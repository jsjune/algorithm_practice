package programmers;

import java.util.Arrays;

public class Test43 {
    public static void main(String[] args) {
        int[] d = {2,2,3,3};
        int budget = 10;
        int answer = 0;
        Arrays.sort(d);
        while(budget>0){
            budget-=d[answer];
            if (budget < 0) {
                break;
            }
            answer++;
            System.out.println(budget);
        }
        System.out.println(answer);
    }
}
