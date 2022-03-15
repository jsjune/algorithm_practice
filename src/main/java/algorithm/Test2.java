package algorithm;

public class Test2 {
    public String solution(int month, int day) {
        int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int finalDay = day+98;
        while (finalDay > 31) {
            if (month > 12) {
                month=1;
            }
            finalDay-=months[month-1];
            month++;
        }
        String answer = month+"월 "+finalDay+"일";
        return answer;
    }

    public static void main(String[] args) {
        Test2 method = new Test2();
        System.out.println(method.solution(1, 18));
    }
}