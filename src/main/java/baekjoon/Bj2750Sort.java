package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Bj2750Sort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] list = new int[n];
        for (int i = 0; i < n; i++) {
            list[i] = Integer.parseInt(br.readLine());
        }

//        int temp = 0;
//        for (int i = 0; i < list.length; i++) {
//            for (int j = 0; j < list.length - i - 1; j++) {
//                if (list[j] > list[j + 1]) {
//                    temp = list[j + 1];
//                    list[j+1] = list[j];
//                    list[j] = temp;
//                }
//
//            }
//        }

        int temp = 0;
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length - 1 - i; j++) {
                if (list[j] > list[j + 1]) {
                    temp = list[j+1];
                    list[j + 1] = list[j];
                    list[j] = temp;
                }
            }
        }
        for (int i : list) {
            System.out.println(i);
        }
    }
}
