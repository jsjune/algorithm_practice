package baekjoon;

// 지각

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj10419BruteForce {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            int d = Integer.parseInt(br.readLine());
            int time = 0;
            for (int j = 1; j < d; j++) {
                if (j + j * j <= d) {
                    time = j;
                } else {
                    break;
                }
            }
            sb.append(time).append('\n');
        }
        System.out.println(sb);
    }
}
