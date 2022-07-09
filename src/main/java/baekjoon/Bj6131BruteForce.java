package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

// 완전 제곱수

public class Bj6131BruteForce {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 500; i++) {
            for (int j = 1; j <= i; j++) {
                if (Math.pow(i, 2) - Math.pow(j, 2) == n) {
                    list.add(i);
                }
            }
        }
        System.out.println(list.size());
    }
}
