package algorithmn_1week;

public class Test15 {
    class Solution {
        public int solution(int[] a, int[] b) {
            int answer=0;
            for(int i=0;i<a.length;i++){
                answer+=a[i]*b[i];
            }
            return answer;
        }
    }
}
