package algorithmn_1week;
////////////////////////////////////////////////////////////
public class Test13 {
        public String solution(int a, int b) {
            int[] day = {5, 1, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4};
            String[] week = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
            int c = day[a - 1];
            // for (int i = 0; i < a; i++) {
            //     sum+=day[i];
            // }
            // int c = (sum%29)%7;
            int dayday = ((b - 1) % 7 + c) % 7;
            String answer = week[dayday];

            return answer;
        }

    public static void main(String[] args) {
        Test13 day = new Test13();
        System.out.println(day.solution(5,24));
    }
}
//
//public String Solution(int a, int b) {
//    String answer = "";
//    String[] day = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
//    int[] date = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//    int allDate = 0;
//    for (int i = 0; i < a - 1; i++) {
//        allDate += date[i];
//    }
//    allDate += (b - 1);
//    answer = day[allDate % 7];
//
//    return answer;
//}
