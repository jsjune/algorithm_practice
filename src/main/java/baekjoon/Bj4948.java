package baekjoon;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Bj4948 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            int n = Integer.parseInt(bf.readLine());
            if (n == 0) {
                break;
            }
            boolean[] isPrime = new boolean[2 * n + 1];
            Arrays.fill(isPrime, true);

            // 소수는 true
            // 0,1은 소수가 아니므로 false
            isPrime[0] = isPrime[1] = false;
            for (int i = 2; i <= Math.sqrt(2 * n + 1); i++) {
                // 만약 i가 소수 혹은 아직 지워지지 않았다면
                if (isPrime[i]) {
                    // i의 배수 j들에 대해 isPrime[j] = false; 로 둔다.
                    // i*i미만의 배수는 이미 지워졌으므로 신경쓰지 않는다.
                    for (int j = i * i; j < 2 * n + 1; j += i) {
                        isPrime[j] = false;
                    }
                }
            }
            int cnt = 0;
            for (int i = n + 1; i < 2 * n + 1; i++) {
                if (isPrime[i] == true) {
                    cnt++;
                }
            }
            System.out.println(cnt);
        }

    }
}
