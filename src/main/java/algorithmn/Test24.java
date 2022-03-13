package algorithmn;

import java.util.Arrays;

public class Test24 {
//    public long solution(long n) {
//        long answer = 0;
//        return answer;
//    }

    public static void main(String[] args) {
//        Test24 res = new Test24();
        long n = 118372;
        String[] list = String.valueOf(n).split("");
        Arrays.sort(list);
        StringBuilder sb = new StringBuilder();
        for(String result : list)sb.append(result);
        System.out.println(Integer.parseInt(sb.reverse().toString()));

//        String s = String.valueOf(n);
//        char[] ch = s.toCharArray();
//        Arrays.sort(ch);
//        StringBuffer sb = new StringBuffer();
//        for (int i = 0; i < ch.length; i++) {
//            sb.append(ch[i]);
//        }
//        System.out.println(Long.valueOf(sb.reverse().toString()));
    }
}
