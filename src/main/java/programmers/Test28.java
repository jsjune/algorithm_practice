package programmers;

public class Test28 {
    public boolean solution(int x) {
        int cnt = 0;
        String[] str = String.valueOf(x).split("");
        for (int i = 0; i < str.length; i++) {
            cnt += Integer.parseInt(str[i]);
        }
        if (x % cnt == 0) {
            return true;
        } else {
            return false;
        }
    }
}
