package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj11721Impl {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        double n = Math.ceil((double) str.length()/10);
        int length = str.length();
        for (int i = 0; i < n; i++) {

            if (length < 10) {
                System.out.println(str.substring(i * 10, i * 10 + length));
            } else {
                System.out.println(str.substring(i*10,i*10+10));
            }
            length-=10;
        }
    }
}
