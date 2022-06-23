package dataStructure;

import java.util.ArrayList;

public class Greedy1 {
    public static void main(String[] args) {
        int n = 1260;
        int count = 0;
        int[] array = {500, 100, 50, 10};
        for (int coin : array) {
            count += n / coin;
            n %= coin;
        }
        System.out.println(count);
    }
}
