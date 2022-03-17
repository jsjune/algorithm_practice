package programmers;

public class Test41 {
    public static void main(String[] args) {
        int left = 13;
        int right = 17;
        int answer = 0;
        for (int i = left; i <= right; i++) {
            if (i % Math.sqrt(i) > 0) {
                answer += i;
            } else {
                answer -= i;
            }
        }
        System.out.println(answer);
//        System.out.println(num%Math.sqrt(num));
    }
}
