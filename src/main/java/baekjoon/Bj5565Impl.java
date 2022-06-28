package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj5565Impl {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int totalPrice = Integer.parseInt(br.readLine());
        for (int i = 1; i < 10; i++) {
            totalPrice -= Integer.parseInt(br.readLine());
        }
        System.out.println(totalPrice);
    }
}
