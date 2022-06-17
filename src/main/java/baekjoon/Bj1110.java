package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj1110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int num2=num;
        int cnt = 0;
        while (true) {
            int a = num/10;
            int b = num%10;
            num= b * 10 + ((a + b)%10);
            cnt++;
            if (num2 == num) {
                break;
            }
        }
        System.out.println(cnt);
    }
}
