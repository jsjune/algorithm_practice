package programmers2;

public class Sort2 {
    public static void main(String[] args) {
        int[] numbers = {6,10,2};
        int[] answers = {};
        for (int i = 0; i < numbers.length; i++) {
            String answer = "";
            answer += String.valueOf(numbers[i]);
            for (int j = 0; j < numbers.length; j++) {
                if (i != j) {
                    answer += String.valueOf(numbers[j]);
                }
            }
            System.out.println(answer);
        }
    }
}
