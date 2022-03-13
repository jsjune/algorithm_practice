package algorithmn;

public class Test9 {
    public static void main(String[] args) {
        String phone_number = "01033334444";
//        String a = phone_number.substring(0,phone_number.length()-4);
//        String qqq = "*";
//        System.out.println(qqq.repeat(phone_number.length()-4)+phone_number.substring(phone_number.length()-4,phone_number.length()));
        System.out.println(phone_number.replaceAll(".(?=.{4})", "*"));
    }
}

//class Solution {
//    public String solution(String phone_number) {
//        char[] ch = phone_number.toCharArray();
//        for(int i = 0; i < ch.length - 4; i ++){
//            ch[i] = '*';
//        }
//        return String.valueOf(ch);
//    }
//}