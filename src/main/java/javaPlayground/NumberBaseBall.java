//package javaPlayground;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//public class NumberBaseBall {
//    final static String result = "713";
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String num = br.readLine();
//        while (!result.equals(num)) {
//
//        }
//    }
//
//    public String getNumber(String num) {
//        if (result.equals(num)) {
//            return "3스트라이크\n" +
//                    "3개의 숫자를 모두 맞히셨습니다! 게임 종료\n" +
//                    "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";
//        }
//        for (int i = 0; i < num.length(); i++) {
//            if (num.charAt(i) == result.charAt(i)) {
//                return "1스트라이크";
//                for (int j = 1; j < num.length(); j++) {
//                    if (num.charAt(i) == result.charAt(j)) {
//
//                    }
//                }
//            }
//        }
//    }
//}
