package algorithmn_1week;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

//public class Test1 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        String star = "";
//        for (int i = 1; i <= a; i++) {
//            star += "*";
//        }
//        for (int i = 0; i < b; i++) {
//            System.out.println(star);
//        }
//    }
//}
