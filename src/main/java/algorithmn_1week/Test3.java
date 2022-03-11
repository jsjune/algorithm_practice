package algorithmn_1week;

public class Test3 {
    String solution(String s) {
        String answer = "";
        int s_len = s.length();
        int num = s_len/2;
        if(s_len % 2 != 0){ // 문자의 길이가 홀수인 경우
            answer = String.valueOf(s.charAt(num));
            // chartAt()를 사용할 경우 타입이 char로 바뀌어서 오류 발생!
            // 그래서 다시 타입에서 char 문자열 타입으로 바꿔줌 String.valueOf()

        }else{ // 문자의 길이가 짝수인 경우
            answer = s.substring(num-1,num+1); // substring 문자열에서 특정 위치부터 특정 위치까지 문자열 파싱하는 법
        }
        return answer;
    }

//    String solution(String s) {
//        return s.substring(((s.length()-1)/2),(s.length()/2)+1);
//    }

    public static void main(String[] args) {
        Test3 sol = new Test3();
        System.out.println(sol.solution("abcde"));
        System.out.println(sol.solution("abcd"));

    }
}
