import java.util.Scanner;

public class Problem1 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the doubles.");
        double[] array = new double[6];
        for (int i = 0; i < array.length; i ++) {
            array[i] = input.nextDouble();
        }
        System.out.println("Sort ascending? true or false.");
        sortArray(array, input.nextBoolean());
    }
    public static void sortArray (double[] x, boolean y) {
        if (y) {
            for (int i = x.length - 1; i >= 0; i --) {
                double max = x[0];
                int index = 0;
                for (int j = 0; j <= i; j ++) {
                    if (x[j] > max) {
                        max = x[j];
                        index = j;
                    }
                }
                x[index] = x[i];
                x[i] = max;
            }
        } else {
            for (int i = x.length - 1; i >= 0; i --) {
                double min = x[0];
                int index = 0;
                for (int j = 0; j <= i; j ++) {
                    if (x[j] < min) {
                        min = x[j];
                        index = j;
                    }
                }
                x[index] = x[i];
                x[i] = min;
            }
        }
        for (double number: x) {
            System.out.println(number);
        }
    }
}
