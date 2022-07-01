package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 답

public class Bj10989Sort {
    public static void main(String[] args) throws IOException {
        int[] cnt = new int[10001];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            cnt[Integer.parseInt(br.readLine())]++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= 10000; i++) {
            for (int j = 0; j < cnt[i]; j++) {
                sb.append(i).append('\n');
            }
        }
        System.out.println(sb);
    }
}
