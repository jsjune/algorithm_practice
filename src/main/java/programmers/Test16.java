package programmers;

public class Test16 {
    public static void main(String[] args) {
        boolean answer = true;
        String s = "Pyy";
        String[] str = new String(s).split("");
        int cnt=0;
        int cnt2=0;
        for (int i = 0; i < str.length; i++) {
            if (str[i].toLowerCase().equals("p")) {
                cnt++;
                System.out.println(cnt);
            } else if (str[i].toLowerCase().equals("y")) {
                cnt2++;
                System.out.println(cnt2);
            }
        }
        if (cnt == cnt2) {
            answer = true;
        } else {
            answer = false;
        }
        System.out.println(answer);
    }
}

//class Solution {
//    boolean solution(String s) {
//        s = s.toLowerCase();
//        int count = 0;
//
//        for (int i = 0; i < s.length(); i++) {
//
//            if (s.charAt(i) == 'p')
//                count++;
//            else if (s.charAt(i) == 'y')
//                count--;
//        }
//
//        if (count == 0)
//            return true;
//        else
//            return false;
//    }
//}