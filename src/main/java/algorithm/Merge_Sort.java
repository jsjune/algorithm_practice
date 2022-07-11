package algorithm;

import baekjoon.Bj10816BinarySearch;

import java.util.Arrays;

public class Merge_Sort {
    private static int[] arr;
    private static int[] temp;

    public static void main(String[] args) {
        arr = new int[]{1, 9, 8, 5, 4, 2, 3, 7, 6};
        temp = new int[arr.length];
        mergeSort(0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort(start, mid);
            mergeSort(mid + 1, end);

            // 두 분할의 첫 번째 원소의 인덱스
            int p = start;
            int q = mid + 1;
            int index = p;

            while (p <= mid || q <= end) {
                // 두 번째 분할의 원소를 이미 다 가져온 경우(q>end)
                // 첫 번째 분할에서 가져오지 않은 원소가 있고, 첫번째 분할의 첫 원소 값이 두 번째 분할의 첫 원소 값보다 작은 경우
                // 안정 정렬이기 때문에 index를 유지
                if (q > end || (p <= mid && arr[p] < arr[q])) {
                    temp[index++] = arr[p++];
                } else {
                    temp[index++] = arr[q++];
                }
            }
            for (int i = start; i <= end; i++) {
                arr[i] = temp[i];
            }
        }
    }
}
