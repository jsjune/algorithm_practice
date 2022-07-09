package baekjoon;

// 나누기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj1075BruteForce {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine())/100*100;
        int f = Integer.parseInt(br.readLine());
        for (int i = 0; i < 100; i++) {
            if (n % f == 0) {
                String ans = String.valueOf(n);
                System.out.println(ans.substring(ans.length()-2,ans.length()));
                break;
            }
            n++;
        }
    }
}
