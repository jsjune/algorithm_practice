package algorithmn_1week;

import java.util.Arrays;

////////////////////////////////////////////////////////////////////////////////////////////////////
public class Test21 {
    public static void main(String[] args) {
        String answer = "try hello world";
        String[] arr = new String[answer.length()];
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                arr[i] = String.valueOf(answer.charAt(i)).toUpperCase();
//            }
                if (arr[i].equals(" ")) {
                    System.out.println("빈간");
                }
//            else{
//
//            arr[i] = String.valueOf(answer.charAt(i));
//            }
//            System.out.println(Arrays.toString(arr));

            }
//        String str = "";
//        for(int i=0;i<arr.length;i++){
//            str += arr[i];
//        }
//        System.out.println(str);
        }
    }
}


