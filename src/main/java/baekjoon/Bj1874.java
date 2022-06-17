package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Bj1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        int num = Integer.parseInt(br.readLine());
        int start = 0;
        for (int i = 0; i < num; i++) {
            int a = Integer.parseInt(br.readLine());
            if(a>start){
                for(int j=start+1;j<a+1;j++){
                    stack.push(j);
                    sb.append("+\n");
                }
                start = a;
            }
            else if (stack.peek() > a) {
                System.out.println("NO");
                return;
//                System.exit(0);
            }
            stack.pop();
            sb.append("-\n");
        }
        System.out.println(sb);
    }
}
