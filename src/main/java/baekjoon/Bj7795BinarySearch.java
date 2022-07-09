package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 먹을것인가 먹힐것인가

public class Bj7795BinarySearch {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int arr1Size = Integer.parseInt(st.nextToken());
            int arr2Size = Integer.parseInt(st.nextToken());
//            int[] arr1 = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
//            int[] arr2 = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).sorted().toArray();
            int[] arr1 = new int[arr1Size];
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < arr1Size; j++) {
                arr1[j] = Integer.parseInt(st.nextToken());
            }

            int[] arr2 = new int[arr2Size];
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < arr2Size; j++) {
                arr2[j] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr2);
            int ans = 0;
            for (int j = 0; j < arr1.length; j++) {
                ans += binarySearch(arr2, arr1[j], 0, arr2.length - 1);
            }
            sb.append(ans).append('\n');
        }
        System.out.println(sb);
    }

    private static int binarySearch(int[] arr2, int target, int start, int end) {
        int cnt = 0;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr2[mid] < target) {
                start = mid + 1;
                cnt=mid+1;
            } else {
                end = mid - 1;
            }
        }
        return cnt;
    }
}
