package baekjoon;

// 게임
// 답

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj1072BinarySearch {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int z = getPercent(x, y);

        int ans = -1;
        int left = 0;
        int right = (int) 1e9;
        while (left <= right) {
            System.out.println("right = " + right + " left = " + left);
            int mid = (left + right) / 2;
            System.out.println("mid = " + mid);
            if (getPercent(x + mid, y + mid) != z) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        System.out.println(ans);

    }

    private static int getPercent(int x, int y) {
        return (int) ((long) y * 100 / x);
    }
}
