package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Bj1475 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();

        int arr[] = new int[10];

        for (char c : n.toCharArray()) {
            int num = c -'0';
            if (num == 9) {
                num = 6;
            }
            arr[num]++;
        }
        arr[6] = (arr[6] / 2) + (arr[6] % 2);
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);

        System.out.println(arr[9]);
    }
}
