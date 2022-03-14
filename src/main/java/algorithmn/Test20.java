package algorithmn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Test20 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();
        for (String player : participant) {
            map.put(player, map.getOrDefault(player, 0) + 1);
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] par = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] com = {"josipa", "filipa", "marina", "nikola"};
        Test20 test = new Test20();
        System.out.println(test.solution(par,com));
    }


}

//        Arrays.sort(participatn);
//                Arrays.sort(completion);
//                int i = 0;
//                for (i = 0; i < completion.length; i++) {
//        if (!participant[i].equals(completion[i])) {
//        break;
//        }
//        }
//        System.out.println(par[i]);
