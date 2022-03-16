package algorithm;

//  성륜이는 오늘 항해99를 시작했다. 성격이 급한 성륜이는 항해 1일 차부터 언제 수료를 하게될 지 궁금하다.
//  항해 1일 차 날짜를 입력하면 98일 이후 항해를 수료하게 되는 날짜를 계산해주는 알고리즘을 만들어보자.
//  제한 조건
//  1 ≤ month ≤ 12
//  1 ≤ day ≤ 31 (2월은 28일로 고정합니다, 즉 윤일은 고려하지 않습니다.)
//  입출력 예
//  11 27 “3월 5일”
//  6 22 “9월 28일”
//  지정 입력값
//  1 18 ‘4월 26일’

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