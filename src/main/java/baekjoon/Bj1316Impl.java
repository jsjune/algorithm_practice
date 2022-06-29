//package baekjoon;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//// 답
//
//public class Bj1316Impl {
//    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//    public static void main(String[] args) throws IOException {
//        int n = Integer.parseInt(br.readLine());
//
//        int cnt = 0;
//        for (int i = 0; i < n; i++) {
//            if (isGroupString()) {
//                cnt++;
//            }
//        }
//        System.out.println(cnt);
//    }
//
//    public static boolean isGroupString() throws IOException {
//        boolean[] alphabetArr = new boolean[26];
//        int previousChar = 0;
//        String str = br.readLine();
//        for (int i = 0; i < str.length(); i++) {
//            char ch = str.charAt(i);
//            if (ch != previousChar && !alphabetArr[ch - 'a']) {
//                alphabetArr[ch-'a']=true;
//                previousChar = ch;
//            } else if (ch != previousChar && alphabetArr[ch - 'a']) {
//                return false;
//            }
//        }
//        return true;
//    }
//}
