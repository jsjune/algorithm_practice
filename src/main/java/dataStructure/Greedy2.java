package dataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Greedy2 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int result = 0;

        while (true) {
            // n이 k로 나누어 떨어지는 수가 될 때까지 빼기
            int target = (n / k) * k;
            result += (n - target);
            n = target;
            // n이 k보다 작을 때 (더 이상 나눌 수 없을 때) 반복문 탈출
            if (n < k) break;
            // k로 나누기
            result += 1;
            n /= k;
        }

        result += (n - 1);
        System.out.println(result);


//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//        int N = Integer.parseInt(st.nextToken());
//        int K = Integer.parseInt(st.nextToken());
//        int count = 0;
//        while (N != 1) {
//            if (N % K == 0) {
//                N = N / K;
//                count++;
//            } else {
//                N--;
//                count++;
//            }
//        }
//        System.out.println(count);
    }
}
