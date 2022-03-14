package algorithmn;

public class Test25 {
    public long solution(long n) {
        if(Math.sqrt(n)-(int)Math.sqrt(n)>0){
            return -1;
        }else{
            return (long)Math.pow(Math.sqrt(n)+1,2);
        }
    }
}
