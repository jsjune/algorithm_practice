package algorithmn;

import java.util.ArrayList;
import java.util.Comparator;
//import java.util.Collections;

////////////////////////////////////////////////////////////////////
public class Test14 {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        for(int i=0; i<arr.length;i++){
            if(arr[i]%divisor==0){
                answer[i]=arr[i];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Test14 arr = new Test14();
        int[] a = {5,9,7,10};
        int b = 5;
        ArrayList<Integer> ar = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {
            if (a[i] % b == 0) {
                ar.add(a[i]);
            }
        }
        if (ar.isEmpty()) {
            ar.add(-1);
        }

        ar.sort(Comparator.naturalOrder());
        System.out.println(ar);
//        int[] result = {};
//        for (int i = 0; i < ar.size(); i++) {
//            result[i]=ar.get(i);
//        }
//        System.out.println(result);
    }

}
