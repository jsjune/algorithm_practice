package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj1977Impl {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int startM = (int) Math.ceil(Math.sqrt(m));
        int endN = (int) Math.sqrt(n);
        long sum = 0;
        for (int i = startM; i <= endN; i++) {
            sum += (long)i * i;
        }
        if (sum==0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(startM * startM);
        }
    }
}
