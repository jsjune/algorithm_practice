//package baekjoon;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.StringTokenizer;
//
//// 숫자 카드 2
//// 답
//// 다시
//
//public class Bj10816BinarySearch {
//    private static StringTokenizer st;
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int[] cnt = new int[20000001];
//
//        int n = Integer.parseInt(br.readLine());
//
//        st = new StringTokenizer(br.readLine(), " ");
//        for (int i = 0; i < n; i++) {
//            cnt[Integer.parseInt(st.nextToken())+10000000]++;
//        }
//
//        int m = Integer.parseInt(br.readLine());
//        st = new StringTokenizer(br.readLine(), " ");
//        StringBuilder sb = new StringBuilder();
//
//        for (int i = 0; i < m; i++) {
//            sb.append(cnt[Integer.parseInt(st.nextToken()) + 10000000]).append(' ');
//        }
//        System.out.println(sb);
//    }
//
//}
