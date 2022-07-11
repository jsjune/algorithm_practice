package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj10817Impl {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int temp = 0;
        if (a < b) {
            temp = a;
            a = b;
            b = temp;
        }
        if (b < c) {
            temp=b;
            b=c;
            c=temp;
        }
        if (a < b) {
            temp=a;
            a=b;
            b=temp;
        }
        System.out.println(b);

//        int[] list = new int[3];
//        for (int i = 0; i < list.length; i++) {
//            list[i] = Integer.parseInt(st.nextToken());
//        }
//        Arrays.sort(list);
//        System.out.println(list[1]);
    }
}
