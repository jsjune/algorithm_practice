package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

// 예산
// 답

public class Bj2512BinarySearch {
    private static int[] arr; // 지방 예산
    private static long answer = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 지방의 수
        arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        long M = Long.parseLong(br.readLine()); //총 예산
        long left = 0;
        long right = arr[N-1];
        while (left <= right) {
            long mid = (left + right) / 2; //내야할 세금
            long sum = 0; // 모든 지방 세금 합
            for (int money : arr) {
                if (money >= mid) sum += mid; //내라는 세금 낼 수 있는 지방
                else sum += money; //못내는 지방은 가진 최대 돈만 냄
            }
            if (sum > M) { // 내라는 세금 보다 많은 경우 -> 세금을  줄여본다.
                right = mid - 1;
            } else { // 내라는 세금보다 적은 경우 -> 세금을 높여서 더 최고의 경우의 수를 찾는다.
                left = mid + 1;
                answer = Math.max(answer, mid);
            }
        }
        System.out.println(answer);
    }
}
