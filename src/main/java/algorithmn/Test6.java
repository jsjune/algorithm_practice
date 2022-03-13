package algorithmn;

import java.util.Arrays;

public class Test6 {
    public int solution(int[] numbers) {
        int sum = Arrays.stream(numbers).sum();
        return 45-sum;
    }

    public static void main(String[] args) {
        Test6 arrNum = new Test6();
        int[] num = new int[] {1,2,3,4,6,7,8,0};
        System.out.println(arrNum.solution(num));
    }
}
