package programmers2;

/*
https://programmers.co.kr/learn/courses/30/lessons/42576
완주하지 못한 선수
 */

import java.util.HashMap;

public class Hash1 {
    public static void main(String[] args) {
        String[] participant = {"leo", "kiki", "eden", "kiki"};
        String[] completion = {"eden", "kiki"};
        Hash1 sol = new Hash1();
        System.out.println(sol.solution(participant, completion));
    }

    public String solution(String[] participants, String[] completions) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();
        for (String participant : participants) {
            map.put(participant, map.getOrDefault(participant, 0) + 1);
        }
        for (String completion : completions) {
            map.put(completion, map.get(completion) - 1);
        }
        for (String key : map.keySet()) {
            if (map.get(key) == 1) {
                answer = key;
                break;
            }
        }
        System.out.println(map);
        return answer;

//        Map<String, Long> participantMap = Arrays.asList(participants).stream()
//                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//        System.out.println(participantMap);
//
//        for (String completion : completions) {
//            Long value = participantMap.get(completion) - 1L;
//            if (value == 0L) {
//                participantMap.remove(completion);
//            } else {
//                participantMap.put(completion, value);
//            }
//        }
////        System.out.println(participantMap);
//        return participantMap.keySet().iterator().next();
    }
}
