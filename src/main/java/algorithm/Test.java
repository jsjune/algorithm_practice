package algorithm;

public class Test {
    public int solution(int[] arr1, int[] arr2) {
        int sum1 = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum1+=arr1[i];
        }
        int sum2 = 0;
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] >= 29) {
                arr2[i]=21;
            }
            sum2+=arr2[i];
        }
        int answer = sum2-sum1;
        return answer;
    }

    public static void main(String[] args) {
        Test method = new Test();
        int[] arr1 = {9, 9, 9, 9, 7, 9, 8};
        int[] arr2 = {23, 23, 30, 28, 30, 23, 23};
        System.out.println(method.solution(arr1, arr2));
    }
}