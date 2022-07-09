package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 랜선 자르기
// 답

public class Bj1654BinarySearch {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int k = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int[] arr = new int[k];
        long max = 0;
        for (int i = 0; i < k; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        max++;
        long min = 0;
        long mid = 0;
        while (min < max) {
            mid = (max + min) / 2;

            int cnt = 0;

            for (int i = 0; i < arr.length; i++) {
                cnt += (arr[i] / mid);
            }

            if (cnt < n) {
                max = mid;
            } else {
                min = mid +1;
            }
        }
        System.out.println(min-1);
    }
}
