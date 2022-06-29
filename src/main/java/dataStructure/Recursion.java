package dataStructure;
// 유클리드 호제법 최대공약수
public class Recursion {
    public static void main(String[] args) {
        System.out.println(gcd(192,162));
    }

    private static int gcd(int a, int b) {
        if (a % b == 0) {
            return b;
        } else {
            return gcd(b, a % b);
        }
    }
}
