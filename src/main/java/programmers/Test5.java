package programmers;

public class Test5 {
    public int solution(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) {
        Test5 alter = new Test5();
        System.out.println(alter.solution("123456789"));
//        String num = "+12345";
//        System.out.println(Integer.parseInt(num));
    }
}

//public int getStrToInt(String str) {
//    boolean Sign = true;
//    int result = 0;
//
//    for (int i = 0; i < str.length(); i++) {
//        char ch = str.charAt(i);
//        if (ch == '-')
//            Sign = false;
//        else if(ch !='+')
//            result = result * 10 + (ch - '0');
//    }
//    return Sign?1:-1 * result;
//}
