package algorithm;

import java.util.Arrays;

public class Insertion_Sort {
    public static void main(String[] args) {
        int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};

        for (int i = 1; i < arr.length; i++) {
            // 인덱스 i부터 1까지 감소하며 반복하는 문법
            for (int j = i; j >= 1; j--) {
                // 한 칸씩 왼쪽으로 이동
                if (arr[j] < arr[j - 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j-1]=tmp;
                }
                // 자기보다 작은 데이터를 만나면 그 위치에서 멈춤
                else break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
