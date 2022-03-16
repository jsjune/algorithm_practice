package programmers;

import java.util.Arrays;
import java.util.Collections;

public class Test36 {
    //    public static void main(String[] args) {
//        String s = "Zbcdefg";
//        Integer[] num = new Integer[s.length()];
//        for (int i = 0; i < s.length(); i++) {
//            num[i]=Integer.valueOf(s.charAt(i));
//        }
//        Arrays.sort(num, Collections.reverseOrder());
//        String answer="";
//        for (int i = 0; i < num.length; i++) {
//            answer+=Character.toString(num[i]);
//        }
//        System.out.println(answer);
//    }
    public String reverseStr(String str) {
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        StringBuffer st = new StringBuffer(String.valueOf(ch));
        st.reverse();
        return st.toString();
    }
}

