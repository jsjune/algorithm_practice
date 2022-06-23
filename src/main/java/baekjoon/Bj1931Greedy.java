package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Bj1931Greedy {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] array = new int[n][2];
        for (int i = 0; i < array.length; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            array[i][0] = Integer.parseInt(st.nextToken());
            array[i][1] = Integer.parseInt(st.nextToken());
        }

//        Arrays.sort(array, (a, b) -> a[1]==b[1] ? a[0] - b[0] : a[1] - b[1]);
        Arrays.sort(array, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] == o2[1]) {
                    return o1[0] - o2[0]; // 음수 오름차순, 양수 내림차순
                }
                return o1[1] - o2[1];
            }
        });

        int count = 0;
        int prev_end_time = 0;

        for (int i = 0; i < n; i++) {
            if (prev_end_time <= array[i][0]) {
                prev_end_time = array[i][1];
                count++;
            }
        }
        System.out.println(count);

    }
}
