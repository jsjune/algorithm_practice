package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj15953Impl {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int[] list = new int[t];
        int result = 0;
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if (a == 1) {
                result += 5000000;
            } else if (a > 1 && a <= 3) {
                result += 3000000;
            } else if (a > 3 && a <= 6) {
                result += 2000000;
            } else if (a > 6 && a <= 10) {
                result += 500000;
            } else if (a > 10 && a <= 15) {
                result += 300000;
            } else if (a > 15 && a <= 21) {
                result += 100000;
            }

            if (b == 1) {
                result += 5120000;
            } else if (b > 1 && b <= 3) {
                result += 2560000;
            } else if (b > 3 && b <= 7) {
                result += 1280000;
            } else if (b > 7 && b <= 15) {
                result += 640000;
            } else if (b > 15 && b <= 31) {
                result += 320000;
            }
            list[i]=result;
            result =0;
        }

        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }

    }
}

