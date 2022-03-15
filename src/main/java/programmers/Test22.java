package programmers;

public class Test22 {
    public static void main(String[] args) {
        int n = 123;
        int answer=0;

        while(n!=0){
            answer += n%10;
            n/=10;
        }
        System.out.println(answer);

//        String[] str = String.valueOf(n)).split("");
//        for (int i = 0; i < str.length; i++) {
//            answer += Integer.valueOf(str[i]);
//        }
//        System.out.println(answer);
    }
}

