package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Bj10828Stack {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String order = st.nextToken();
            if (order.equals("push")) {
                stack.push(st.nextToken());
            }else if (order.equals("pop")) {
                System.out.println(stack.empty() ? -1 : stack.pop());
            }else if (order.equals("size")) {
                System.out.println(stack.size());
            }else if (order.equals("empty")) {
                System.out.println(stack.empty() ? 1 : 0);
            }else if (order.equals("top")) {
                System.out.println(stack.empty()?-1:stack.peek());
            }
        }
    }
}
