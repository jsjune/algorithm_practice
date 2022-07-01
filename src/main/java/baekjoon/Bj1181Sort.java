package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

// 답

public class Bj1181Sort {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] strArr = new String[n];
        for (int i = 0; i < n; i++) {
            strArr[i] = br.readLine();
        }

        Arrays.sort(strArr, ((o1, o2) -> o1.length() == o2.length() ? o1.compareTo(o2) : o1.length() - o2.length()));
//        Arrays.sort(strArr, new Comparator<String>() {
//            public int compare(String s1, String s2) {
//                // 단어 길이가 같을 경우
//                if (s1.length() == s2.length()) {
//                    return s1.compareTo(s2);
//                }
//                // 그 외의 경우
//                else {
//                    System.out.println("s1 = " + s1);
//                    System.out.println("s2 = " + s2);
//                    System.out.println(Arrays.toString(strArr));
//                    System.out.println(s1.length() - s2.length());
//                    return s1.length() - s2.length();
//                }
//            }
//        });

        System.out.println(strArr[0]);

        for (int i = 1; i < n; i++) {
            if (!strArr[i].equals(strArr[i - 1])) {
                System.out.println(strArr[i]);
            }
        }

    }
}
