package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.TreeMap;

public class Bj2822Sort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[8];
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < 8; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            map.put(arr[i], i);
        }
        System.out.println(map);

        Arrays.sort(arr);
        int[] arr2 = new int[5];
        int num = arr[2];
        int cnt = 0;
        int sum = 0;
        for (Integer i : map.keySet()) {
            if (i > num) {
                sum+=i;
                arr2[cnt] = map.get(i);
                cnt++;
            }
        }
        Arrays.sort(arr2);
        System.out.println(sum);
        for (int i : arr2) {
            System.out.print(i+1+" ");
        }
    }
}
