package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

public class Test32 {
    public static void main(String[] args) {
        int[] numbers = {2, 1, 3, 4, 1};
        ArrayList<Integer> list = new ArrayList<>();
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                list.add(numbers[i] + numbers[j]);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            set.add(list.get(i));
        }
        Integer[] arr = set.toArray(new Integer[0]);
        int[] answer = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            answer[i]=arr[i];
        }
    }
}
