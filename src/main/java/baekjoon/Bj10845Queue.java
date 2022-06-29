package baekjoon;

import java.io.*;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Bj10845Queue {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> q = new LinkedList<>();
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String order = st.nextToken();
            if (order.equals("push")) {
                q.offer(Integer.parseInt(st.nextToken()));
            } else if (order.equals("pop")) {
                System.out.println(q.isEmpty() ? -1 : q.poll());
            } else if (order.equals("size")) {
                System.out.println(q.size());
            } else if (order.equals("empty")) {
                System.out.println(q.isEmpty() ? 1 : 0);
            } else if (order.equals("front")) {
                System.out.println(q.isEmpty() ? -1 : q.peek());
            } else if (order.equals("back")) {
                System.out.println(q.isEmpty() ? -1 : filter(q));
            }
        }

    }

    private static int filter(Queue<Integer> q) {
        int num = 0;
        for (Integer integer : q) {
            num = integer;
        }
        return num;
    }
}
