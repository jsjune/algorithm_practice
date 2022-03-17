package algorithm;

// 현아는 항해에서 한 주 동안 몇 시간 동안 공부했는 지 기록할 수 있는 알고리즘을 만드는데 성공했다.
//        공부시간을 꼼꼼하게 관리하는 현아는 이번에 분 단위까지 계산할 수 있는 알고리즘을 만들기로 마음을 먹었다.
//
//    항해의 체크인 페이지에는 몇가지 조건이 있는데 이를 만족하는 알고리즘을 만들어보자.
//        체크아웃을 할 때 익일 시간은 24+a 로 계산한다. 즉 새벽 2시는 24+2 인 26으로 표기한다.
//        체크인 페이지는 새벽 5시까지 체크아웃이 되어 있지 않으면 체크아웃을 깜빡한 것으로 간주한다.
//        따라서 체크인 시스템은 새벽 5시 정각이나, 새벽 5시를 넘겨서 체크아웃을 하게 되면 자동으로 체크아웃을 오후 9시(21:00)로 한 것으로 처리한다.
// 제한 조건
//        체크인(checkin)과 체크아웃(checkout)을 진행한 시간이 담긴 배열 두 개가 주어진다.
//        각 배열에는 월요일부터 일요일까지 체크인/아웃을 한 시간이 담겨있다.
//        checkin과 checkout 배열의 길이는 각각 7 이다.
//        result는 반드시 “00시간 00분” 형식의 문자열로 출력해주셔야 합니다.

public class Test4 {
    public static void main(String[] args) {
        Test4 method = new Test4();
        String[] arr1 = {"7:51" ,"8:58", "8:56", "8:35", "9:00", "8:46", "8:56"};
        String[] arr2 = {"22:24" ,"21:51", "25:30", "29:10", "29:12", "22:15", "21:31"};

        int sumCheckinhour = 0;
        int sumCheckinminute = 0;
        String[][] arrin = new String[arr1.length][arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            arrin[i]=arr1[i].split(":");
        }
        for (int i = 0; i < arrin.length; i++) {
            sumCheckinhour += Integer.valueOf(arrin[i][0]);
            sumCheckinminute += Integer.valueOf(arrin[i][1]);
        }

        int sumCheckouthour = 0;
        int sumCheckoutminute = 0;
        String[][] arrout = new String[arr2.length][arr2.length];
        for (int i = 0; i < arr2.length; i++) {
            arrout[i]=arr2[i].split(":");
        }
        for (int i = 0; i < arrout.length; i++) {
            if (Integer.valueOf(arrout[i][0]) >= 29) {
                arrout[i][0]="21";
                arrout[i][1]="0";
            }
            sumCheckouthour += Integer.valueOf(arrout[i][0]);
            sumCheckoutminute += Integer.valueOf(arrout[i][1]);
        }

        while (sumCheckinminute > 60) {
            sumCheckinminute-=60;
            sumCheckinhour++;
        }

        while (sumCheckoutminute > 60) {
            sumCheckoutminute-=60;
            sumCheckouthour++;
        }

        int finalhour = sumCheckouthour-sumCheckinhour;
        int finalminute = sumCheckoutminute-sumCheckinminute;
        if (finalminute < 0) {
            finalhour-=1;
            finalminute+=60;
        }
        System.out.println(finalhour +"시간 "+finalminute+"분");
    }

}
