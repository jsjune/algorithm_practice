//package baekjoon;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.StringTokenizer;
//
//public class Bj1629Recursion {
//    static int c;
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        final int a = Integer.parseInt(st.nextToken());
//        int b = Integer.parseInt(st.nextToken());
//        c = Integer.parseInt(st.nextToken());
//
//        System.out.println(pow(a,b));
//
//    }
//
//    private static long pow(int a, int b) {
//        if (b == 1) {
//            return a%c;
//        }
//        long temp = pow(a, b / 2);
//
//        if (b % 2 == 1) {
//            return (temp * temp % c) * a % c;
//        }
//        return temp*temp%c;
//    }
//
//
//}
