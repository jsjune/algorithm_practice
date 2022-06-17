package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj1011 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int distance = y - x;
            int max = (int)Math.sqrt(distance);

            if (Math.pow(max, 2) == distance) {
                System.out.println(max * 2 - 1);
            } else if (distance <= max * (max + 1)) {
                System.out.println(max*2);
            } else{
                System.out.println(max*2+1);
            }




        }
    }
}
