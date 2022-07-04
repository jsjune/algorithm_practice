package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 시간초과 -> 답

public class Bj10815Sort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] cards = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(cards);
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            int temp = Integer.parseInt(st.nextToken());
            sb.append(binarySearch(cards, n, temp)).append(' ');
        }
        System.out.println(sb);
    }

    private static int binarySearch(int[] cards, int n, int search) {
        int first = 0;
        int last = n-1;
        int mid = 0;

        while (first <= last) {
            mid = (first + last) / 2;
            if (cards[mid] == search) {
                return 1;
            }
            if (cards[mid] < search) {
                first = mid + 1;
            } else {
                last = mid-1;
            }
        }
        return 0;
    }
}
