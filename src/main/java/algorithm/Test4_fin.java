package algorithm;

public class Test4_fin {
    public static void main(String[] args) {
        String[] arr1 = {"7:51" ,"8:58", "8:56", "8:35", "9:00", "8:46", "8:56"};
        String[] arr2 = {"22:24" ,"21:51", "25:30", "29:10", "29:12", "22:15", "21:31"};

        String[][] arr11 = arrSplit(arr1);
        int sumCheckinhour = suminHour(arr11);
        int sumCheckinminute = suminMinute(arr11);

        String[][] arr22 = arrSplit(arr2);
        String[][] arr23 = arrSplit(arr2);
        int sumCheckouthour = sumoutHour(arr22);
        int sumCheckoutminute = sumoutMinute(arr23);

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


    private static String[][] arrSplit(String[] arr) {
        String[][] answer = new String[arr.length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            answer[i]=arr[i].split(":");
        }
        return answer;
    }

    private static int suminHour(String[][] arr) {
        int answer = 0;
        for (int i = 0; i < arr.length; i++) {
            answer += Integer.valueOf(arr[i][0]);
        }
        return answer;
    }
    private static int suminMinute(String[][] arr) {
        int answer = 0;
        for (int i = 0; i < arr.length; i++) {
            answer += Integer.valueOf(arr[i][1]);
        }
        return answer;
    }

    private static int sumoutHour(String[][] arr) {
        int answer = 0;
        for (int i = 0; i < arr.length; i++) {
            if (Integer.valueOf(arr[i][0]) >= 29) {
                arr[i][0]="21";
            }
            answer += Integer.valueOf(arr[i][0]);
        }
        return answer;
    }
    private static int sumoutMinute(String[][] arr) {
        int answer = 0;
        for (int i = 0; i < arr.length; i++) {
            if (Integer.valueOf(arr[i][0]) >= 29) {
                arr[i][1]="0";
            }
            answer += Integer.valueOf(arr[i][1]);
        }
        return answer;
    }
}
