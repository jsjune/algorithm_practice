package algorithmn_1week;
////////////////////////////////////////////////////////////////////
public class Test14 {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        for(int i=0; i<arr.length;i++){
            if(arr[i]%divisor==0){
                answer[i]=arr[i];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Test14 arr = new Test14();
        int[] a = {3, 9, 7, 8};
        int b = 5;
//        System.out.println(arr.solution(a,b));
        int cnt = 0;
        for(int i=0; i<a.length;i++){
            if(a[i]%b==0){
                cnt += 1;
            }
        }
        System.out.println(cnt);

    }

}
