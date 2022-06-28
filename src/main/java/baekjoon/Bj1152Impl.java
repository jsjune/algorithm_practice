package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj1152Impl {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        int cnt = 0;
        for (int i = 0; i < word.length(); i++) {
            if (String.valueOf(word.charAt(i)).equals(" ")) {
                cnt++;
            }
        }
        if (String.valueOf(word.charAt(0)).equals(" ")) {
            cnt--;
        }
        if (String.valueOf(word.charAt(word.length()-1)).equals(" ")) {
            cnt--;
        }
        System.out.println(cnt+1);
    }
}
