package algorithmn;

public class Test2 {
        public String solution(int num) {
            String answer = "";
            if (num % 2 == 0) {
                answer = "Even";
            } else {
                answer = "Odd";
            }
            return answer;
        }
    public static void main(String[] args) {
        Test2 sol = new Test2();
        System.out.println(sol.solution(3));
        System.out.println(sol.solution(2));
    }
}

//    String evenOrOdd(int num) {
//        return num % 2 == 0 ? "Even": "Odd";
//    }
