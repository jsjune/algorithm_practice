package algorithmn;
///////////////////////////////////////////////////////////
public class Test18 {
    public static void main(String[] args) {
        String[] seoul = {"Jane","Kim"};
        String answer = "";
        for(int i=0;i<seoul.length;i++){
//            if(seoul[i].equals("Kim")){
            if(seoul[i]==("Kim")){
                answer = "김서방은 "+i+"에 있다";
                break;
            }
        }
//        answer = "김서방은 "+cnt+"에 있다";
        System.out.println(answer);
    }
}
//
//import java.util.Arrays;
//
//public class Test16 {
//    public static void main(String[] args) {
//        String[] seoul = {"Jane","Kim"};
//
//        System.out.println(Arrays.asList(seoul).indexOf("Kim"));
//    }
//}
