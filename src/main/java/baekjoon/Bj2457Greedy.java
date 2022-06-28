package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Bj2457Greedy {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int start = 301;
        int end = 1201;
        int[][] array = new int[n][2];
        for (int i = 0; i < array.length; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int startMonth = Integer.parseInt(st.nextToken());
            int startDay = Integer.parseInt(st.nextToken());
            int endMonth = Integer.parseInt(st.nextToken());
            int endDay = Integer.parseInt(st.nextToken());
            array[i][0] = startMonth * 100 + startDay;
            array[i][1] = endMonth * 100 + endDay;
        }

        int lastFall = 0, count = 0, temp = start;
        while (lastFall < end) {
            for (int i = 0; i < n; i++) {
                if (temp >= array[i][0]) {
                    if (array[i][1] > lastFall) {
                        lastFall = array[i][1];
                    }
                }
            }
            if (temp == lastFall) { // 다시 돌았을때 같으면 조건에 맞지 않음
                count=0;
                break;
            }
            temp = lastFall;
            count++;
        }
        System.out.println(count);
        System.out.println(Arrays.deepToString(array));
    }
}

/*
10
215 323
412 605
502 531
914 1224
615 903
603 615
228 425
615 927
1005 1231
714 901

301 ~ 1201
===start : 301===
215 323
228 425 -> 425
===425===
215 323
412 605 -> 605
228 425
===605===
215 323
412 605
502 531
603 615 -> 615
===615===
215 323
412 605
502 531
615 903
603 615
228 425
615 927 -> 927
===927===
215 323
412 605
502 531
914 1224 -> 1224
615 903
603 615
228 425
615 927
714 901
 */
