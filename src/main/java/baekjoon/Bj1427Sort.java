package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Bj1427Sort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int num = Integer.parseInt(br.readLine());
        String num = br.readLine();
        String[] arr = new String[num.length()];
        for (int i = 0; i < num.length(); i++) {
            arr[i]=String.valueOf(num.charAt(i));
        }
        Arrays.sort(arr, Comparator.reverseOrder());
        String result = "";
        for (String s : arr) {
            result += s;
        }
        System.out.println(result);

    }
}
