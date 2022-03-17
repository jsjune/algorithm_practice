package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class Test44 {
    public static void main(String[] args) {
        int n = 12;
        int m = 16;

//        int min=0;
//        long max=0;
//        ArrayList<Integer> list1 = new ArrayList<>();
//        ArrayList<Integer> list2 = new ArrayList<>();
//        for (int i = 1; i <= n; i++) {
//            if (n % i == 0) {
//                list1.add(i);
//            }
//        }
//        for (int i = 1; i <= 16; i++) {
//            if (m % i == 0) {
//                list2.add(i);
//            }
//        }
//        for (int i = 0; i < list1.size(); i++) {
//            for (int j = 0; j < list2.size(); j++) {
//                if (list1.get(i).equals(list2.get(j))) {
//                    min = list1.get(i);
//                }
//            }
//        }
//        max=min*(n/min)*(m/min);
//        long[] answer = {min, max};
//        System.out.println(Arrays.toString(answer));


        int tmp;
        while (m != 0) {
            tmp=n%m;
            n=m;
            m=tmp;
        }

//        System.out.println(answer);
    }
}
