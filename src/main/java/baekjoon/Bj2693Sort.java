package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Bj2693Sort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        int[][] arr = new int[t][10];
        StringTokenizer st;
        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            int[] cnt = new int[1001];

            for (int j = 0; j < 10; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                cnt[arr[i][j]]++;
            }

            int[] result = new int[10];
            int num=0;
            for (int j = 0; j <= 1000; j++) {
                for (int k = 0; k < cnt[j]; k++) {
                    result[num++]=j;
                }
            }
//            System.out.println(result[7]);
            sb.append(result[7]).append('\n');
        }
        System.out.println(sb);


    }
}
