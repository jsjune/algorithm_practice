package programmers;

import java.util.ArrayList;

public class Test37 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 7, 6, 4};
        ArrayList<Integer> sumList = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    sumList.add(nums[i] + nums[j] + nums[k]);
                }
            }
        }
        System.out.println(sumList);
        int answer=0;
        for (int i = 0; i < sumList.size(); i++) {
            for(int j=1;j< sumList.get(i);j++){
                if(sumList.get(i)%j==0){

                }
            }
        }
        System.out.println(answer);
    }
}
