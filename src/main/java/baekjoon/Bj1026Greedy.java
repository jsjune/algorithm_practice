package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Bj1026Greedy {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list1.add(scanner.nextInt());
        }
        for (int i = 0; i < n; i++) {
            list2.add(scanner.nextInt());
        }

        System.out.println(list1);
        System.out.println(list2);
    }
}
