package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
3kg or 5kg
 */

public class Bj2839 {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int cnt = 0;

        while (N>0) {
            if (N % 5 == 0) {
                cnt += N / 5;
                break;
            }

            if (N <= 2 ) {
                cnt = -1;
                break;
            }

            N = N-3;
            cnt++;

        }
        System.out.println(cnt);
    }
}
