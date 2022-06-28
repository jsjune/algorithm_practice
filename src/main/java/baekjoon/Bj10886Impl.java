package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Bj10886Impl {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] cuteOrNot = new int[n];
        int totalcount = 0;
        for (int i = 0; i < n; i++) {
            if (Integer.parseInt(br.readLine()) == 1) {
                cuteOrNot[i] = 1;
                totalcount++;
            } else {
                cuteOrNot[i] = 0;
            }
        }
        if (Math.ceil((double) cuteOrNot.length / 2) <= totalcount) {
            System.out.println("Junhee is cute!");
        } else {
            System.out.println("Junhee is not cute!");

        }
    }
}
