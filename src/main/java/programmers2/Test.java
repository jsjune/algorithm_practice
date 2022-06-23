//package programmers2;
//
//import java.util.Arrays;
//
//public class Test {
//    public static void main(String[] args) {
//        int[] answer = new int[3];
//        int[] array = {1, 5, 2, 6, 3, 7, 4};
//        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
//        for (int i = 0; i < commands.length; i++) {
//            int[] reArray = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
//            Arrays.sort(reArray);
//            System.out.println(Arrays.toString(reArray));
//            answer[i] = reArray[commands[i][2] - 1];
//
//        }
//            System.out.println(Arrays.toString(answer));
//    }
//}
