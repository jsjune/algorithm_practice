package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class Test26 {
//    public int[] solution(int[] arr) {
//        ArrayList<Integer> num = new ArrayList<>();
//        int cnt=0;
//        if (arr.length == 1) {
//            num.add(-1);
//            cnt++;
//        }else{
//            for (int i = 0; i < arr.length - 1; i++) {
//                cnt++;
//                if (arr[i + 1] > arr[i]) {
//                    num.add(i,arr[i+1]);
//                }else{
//                    num.add(i, arr[i]);
//                }
//            }
//        }
//        int[] answer = new int[cnt];
//        for (int i = 0; i < num.size(); i++) {
//            answer[i] = num.get(i);
//        }
//        return answer;
//    }

    public int[] solution(int[] arr) {
        int[] temp = arr.clone();
        Arrays.sort(temp);
        int min = temp[0];
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=min){
                list.add(arr[i]);
            }
        }
        int[] answer;
        if (list.size() == 0) {
            answer = new int[1];
            answer[0]=-1;
        }else{
            answer = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                answer[i] = list.get(i);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Test26 test = new Test26();
        int[] arr = {4, 3, 2, 1};
        System.out.println(test.solution(arr));
    }
}

//class Solution {
//    public int[] solution(int[] arr) {
//        if(arr.length == 1){
//            int[] answer = {-1};
//            return answer;
//        }
//
//        int[] answer = new int[arr.length-1];
//        int minIndex=0;
//
//        for(int i=0;i<arr.length;i++){
//            if(arr[minIndex]>arr[i]){
//                minIndex = i;
//            }
//        }
//        for(int i=minIndex+1;i<arr.length;i++){
//            arr[i-1] = arr[i];
//        }
//        for(int i=0;i<answer.length;i++){
//            answer[i] = arr[i];
//        }
//        return answer;
//    }
//}