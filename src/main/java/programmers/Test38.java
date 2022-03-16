package programmers;

import java.util.Arrays;
import java.util.TreeMap;

public class Test38 {
    public static void main(String[] args) {
        String s = "23four5six7";
//        String[] str = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
//        TreeMap<Integer,String> map = new TreeMap<>();
//        for (int i = 0; i < str.length; i++) {
//            map.put(i, str[i]);
//        }
//        System.out.println(map);
        String[] numberToWords = new String[]{"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for (int i = 0; i < numberToWords.length; i++) {
            s = s.replaceAll(numberToWords[i], String.valueOf(i));
        }
        System.out.println(Integer.parseInt(s));
    }
}
