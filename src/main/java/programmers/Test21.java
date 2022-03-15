package programmers;

////////////////////////////////////////////////////////////////////////////////////////////////////
public class Test21 {
    public static void main(String[] args) {
        String s = "abcd abcd adc ";
        String a = "";
        String[] str = s.split("");
        int cnt = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i].equals(" ")) {
                cnt = 0;
            } else if (cnt % 2 == 0) {
                str[i] = str[i].toUpperCase();
                cnt++;
            } else if (cnt % 2 != 0) {
                str[i] = str[i].toLowerCase();
                cnt++;
            }
            a += str[i];
        }

        System.out.println(a);

//        StringBuilder builder = new StringBuilder();
//        for (String abc : str) {
//            builder.append(abc);
//        }
//        System.out.println(builder);
    }
}


