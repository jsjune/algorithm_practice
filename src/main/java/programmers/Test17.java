package programmers;

public class Test17 {
    public static void main(String[] args) {
        boolean answer = true;
        String s = "a234";
        if(s.length()==4||s.length()==6){
            for (int i = 0; i < s.length(); i++) {
                if (Integer.valueOf(s.charAt(i)) >57||Integer.valueOf(s.charAt(i))<48){
                    answer=false;
                    break;
                }
            }
        }else{
            answer=false;
        }
        System.out.println(answer);
    }
}
//            if (Integer.valueOf(s.charAt(i)) >= 48 && Integer.valueOf(s.charAt(i)) <= 57) {
