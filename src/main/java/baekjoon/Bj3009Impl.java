package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Bj3009Impl {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] square = new int[4][2];
        StringTokenizer st;
        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 2; j++) {
                square[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        if (square[0][0] == square[1][0]) {
            square[3][0] = square[2][0];
        } else if (square[0][0] == square[2][0]) {
            square[3][0] = square[1][0];
        } else if (square[1][0] == square[2][0]) {
            square[3][0] = square[0][0];
        }

        if (square[0][1] == square[1][1]) {
            square[3][1] = square[2][1];
        } else if (square[0][1] == square[2][1]) {
            square[3][1] = square[1][1];
        } else if (square[1][1] == square[2][1]) {
            square[3][1] = square[0][1];
        }
        System.out.println(square[3][0] + " " + square[3][1]);
    }
}
