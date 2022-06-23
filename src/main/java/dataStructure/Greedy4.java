package dataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Greedy4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arrayList.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(arrayList);

        int result = 0; // 총 그룹의 수
        int count = 0; // 현재 그룹에 포함된 모험가의 수
        for (int i = 0; i < n; i++) {
            count++; // 현재 그룹에 해당 모험가를 포함시키기
            if (count >= arrayList.get(i)) {
                result+=1;
                count=0; // 현재 그룹에 포함된 모험가의 수 초기화
            }
        }
    }
}
