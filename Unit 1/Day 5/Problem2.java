import java.util.Scanner;

public class Problem2 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many doubles would you like to enter?");
        int len = input.nextInt();
        double[] array = new double[len];
        for (int i = 0; i < len; i ++) {
            array[i] = input.nextDouble();
        }
        reverseArray(array);
    }
    public static void reverseArray (double[] array) {
        for (int i = array.length - 1; i > -1; i --) {
            System.out.println(array[i]);
        }
    }
}