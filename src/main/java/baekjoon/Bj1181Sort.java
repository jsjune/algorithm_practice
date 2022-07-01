//package baekjoon;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.Arrays;
//
//// 답
//
//public class Bj1181Sort {
//    public static int compareStrings(String word1, String word2) {
//        for (int i = 0; i < Math.min(word1.length(), word2.length()); i++) {
//            if ((int) word1.charAt(i) != (int) word2.charAt(i)) {
//                return (int) word1.charAt(i) - (int) word2.charAt(i);
//            }
//        }
//        if (word1.length() != word2.length()) {
//            return word1.length() - word2.length();
//        } else {
//            return 0;
//        }
//    }
//
//    public static String[] stringArraySort(String[] words) {
//        for(int i = 0; i < words.length - 1; i++) {
//            for (int j = i + 1; j < words.length; j++) {
//                if (compareStrings(words[i], words[j]) > 0)//words[i] is greater than words[j]
//                {
//                    String temp = words[i];
//                    words[i] = words[j];
//                    words[j] = temp;
//                }
//            }
//        }
//        return words;
//    }
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        String[] strArr = new String[n];
//        for (int i = 0; i < n; i++) {
//            strArr[i] = br.readLine();
//        }
//        int[] cnt = new int[51];
//
//    }
//}
