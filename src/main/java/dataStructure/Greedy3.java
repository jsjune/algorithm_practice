package dataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Greedy3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String data = br.readLine();

        // 첫 번째 문자를 숫자로 변경한 값을 대입
        long result = data.charAt(0) - '0';
        for (int i = 1; i < data.length(); i++) {
            // 두 수 중에서 하나라도 '0' 혹은 '1'인 경우, 곱하기보다는 더하기 수행
            int num = data.charAt(i) - '0';
            if (result<=1||num <= 1) {
                result += num;
            } else {
                result *= num;
            }
        }
        System.out.println(result);

    }
}
