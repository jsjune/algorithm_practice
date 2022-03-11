package Test;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            arr.add(x * i);
        }
        System.out.println(0);
    }
}
