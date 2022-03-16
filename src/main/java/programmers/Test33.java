package programmers;

import java.util.Arrays;

public class Test33 {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] rank = {6,6,5,4,3,2,1};
        int highcnt=0;
        int cnt=0;
        for (int i = 0; i < lottos.length; i++) {
            for(int j=0;j<lottos.length;j++){
                if (lottos[i] == win_nums[j]) {
                    cnt++;
                }
            }
        }
        for(int i=0;i<lottos.length;i++){
            if(lottos[i]==0){
                highcnt++;
            }
        }
        int[] answer = {rank[cnt+highcnt],rank[cnt]};
        return answer;
    }

    public static void main(String[] args) {
        Test33 test = new Test33();
        int[] lottos = {45, 4, 35, 20, 3, 9};
        int[] win_nums = {20, 9, 3, 45, 4, 35};

        System.out.println(Arrays.toString(test.solution(lottos,win_nums)));
    }
}
