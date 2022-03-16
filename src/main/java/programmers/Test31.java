package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class Test31 {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] answer = {};
        int num = -1; // 원소가 0~9까지 이므로 영향 안받는 아무 숫자.
        for (int i = 0; i < arr.length;i++) {
            if (arr[i] != num) {
                list.add(arr[i]);
                num=arr[i];
            }
        }
        answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        Test31 test = new Test31();
        int[] arr = {1,1,3,3,0,1,1};
        System.out.println(Arrays.toString(test.solution(arr)));
    }
}
