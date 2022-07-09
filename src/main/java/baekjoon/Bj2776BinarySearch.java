package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 암기왕

public class Bj2776BinarySearch {
    private static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr);

            int m = Integer.parseInt(br.readLine());
            int[] arr2 = new int[m];
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arr2[j] = Integer.parseInt(st.nextToken());
            }

            for (int j = 0; j < m; j++) {
                sb.append(binarySearch(arr, arr2[j], 0, n - 1)).append('\n');
            }
        }
        System.out.println(sb);
    }

    private static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = (start + end) / 2;
            // 찾은 경우 중간점 인덱스 반환
            if (arr[mid] == target) {
                return 1;
            }
            // 중간점의 값보다 찾고자 하는 값이 작은 경우 왼쪽 확인
            else if (arr[mid] > target) {
                end = mid - 1;
            }
            // 중간점의 값보다 찾고자 하는 값이 큰 경우 오른쪽 확인
            else {
                start = mid + 1;
            }
        }
        return 0;
    }
}
