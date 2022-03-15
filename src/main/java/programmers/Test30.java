package programmers;

public class Test30 {
    public static void main(String[] args) {
        int[][] sizes = {{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}};
        for (int i = 0; i < sizes.length; i++) {
            int temp = 0;
            if (sizes[i][0] > sizes[i][1]) {
            }else{
                temp = sizes[i][0];
                sizes[i][0]=sizes[i][1];
                sizes[i][1]=temp;
            }
        }
        int x = sizes[0][0];
        int y = sizes[0][1];
        for (int i = 0; i < sizes.length; i++) {
            if(x>sizes[i][0]){
            }else{
                x=sizes[i][0];
            }
        }
        for (int i = 0; i < sizes.length; i++) {
            if(y>sizes[i][1]){
            }else{
                y=sizes[i][1];
            }
        }
        System.out.println(x*y);
    }
}
