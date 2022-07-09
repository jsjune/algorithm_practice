package baekjoon;

// 수학적 호기심

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj9094BruteForce {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            int cnt = 0;
            for (int j = 1; j < n; j++) {
                for (int k = 1; k < j; k++) {
                    if (Math.ceil((Math.pow(k, 2) + Math.pow(j, 2) + m) / (j * k)) == (Math.pow(k, 2) + Math.pow(j, 2) + m) / (j * k)) {
                        cnt++;
                    }
                }
            }
            sb.append(cnt).append('\n');
        }
        System.out.println(sb);

    }
}
