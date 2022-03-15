package programmers;

import java.util.ArrayList;

public class Test31 {
    public static void main(String[] args) {
        int[] arr = {1,1,3,3,0,1,1};
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i + 1] == arr[i]) {
                list.remove(arr[i + 1]);
            }
        }
        System.out.println(list);
    }
}
