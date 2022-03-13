package algorithmn;

import java.util.Arrays;

public class Test8 {
    public double solution(int[] arr) {
//        double sum = Arrays.stream(arr).sum();
//        double answer = sum/arr.length;
        return (double)Arrays.stream(arr).sum()/arr.length;
    }

    public static void main(String[] args) {
        Test8 avg = new Test8();
        int[] arr = new int[]{1,2,3,4};
        System.out.println(avg.solution(arr));
    }
}
