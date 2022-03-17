package programmers;

public class Test46 {
    public static void main(String[] args) {
        int n = 10;
        int answer = 0;
        for (int i = n; i >0; i--) {
            if (n % i == 1) {
                answer = i;
            }
        }
        System.out.println(answer);
    }
}
