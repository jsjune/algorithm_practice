package programmers;

import java.util.ArrayList;

public class Test42 {
    public static void main(String[] args) {
        int n= 15;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                list.add(i);
            }
        }
        int answer = 0;
        for(int i=0;i<list.size();i++){
            answer+=list.get(i);
        }
        System.out.println(answer);
    }
}
