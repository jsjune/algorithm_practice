package algorithm;

// CS 스터디 팀장이 된 지용이는 팀원들의 연락처를 수집하여 정리하는 도중 문제 하나를 발견했다.
//        지용이는 팀원들에게 전화번호를 ‘010-1234-4567’ 양식으로 제출하기를 부탁했지만 ‘01012345678’과 같이 ‘-’ 구분 없이 붙여서 제출한 사람들의 전화번호가 엑셀에서 앞에 0이 사라진 ‘1012345678’로 보이는 것이다.
//        지용이는 ‘1012345678’로 저장된 전화번호를 다시 ‘010-1234-5678’ 형식으로 바꾸려고 한다.
//        지용이를 도와줄 수 있는 알고리즘을 만들어 보자
// 제한 조건
//        phone은 length는 10으로 고정됩니다.

import java.util.ArrayList;

public class Test3 {
    public String solution(String phone) {
        String[] ss = phone.split("");
        ArrayList<String> list = new ArrayList<>();
        list.add("0");
        for (int i = 0; i < ss.length; i++) {
            if (i == 2 || i == 6) {
                list.add("-");
            }
            list.add(ss[i]);
        }
        String answer = "";
        for (int i = 0; i < list.size(); i++) {
            answer += list.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        Test3 method = new Test3();
        System.out.println(method.solution("1062509911"));

    }
}

//        String str = "1062509911";
//        String[] ss = str.split("");
//        ArrayList<String> list = new ArrayList<>();
//        list.add("0");
//        for (int i = 0; i < ss.length; i++) {
//            if (i == 2 || i == 6) {
//                list.add("-");
//            }
//            list.add(ss[i]);
//        }
//        System.out.println(list);
//        String answer = "";
//        for (int i = 0; i < list.size(); i++) {
//            answer += list.get(i);
//        }
//        System.out.println(answer);
