package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj1009Impl {
    public static void main(String[] args) throws IOException {
        int[][] list = {{10, 10, 10, 10}, {1, 1, 1, 1}, {6, 2, 4, 8}, {1, 3, 9, 7}, {6, 4, 6, 4}, {5, 5, 5, 5}, {6, 6, 6, 6}, {1, 7, 9, 3}, {6, 8, 4, 2}, {1, 9, 1, 9}};

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int computerNum = a % 10;
            int divideNum = b % 4;

            System.out.println(list[computerNum][divideNum]);
        }
    }
}
