import java.util.Scanner;

public class Problem1 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many doubles would you like to print?");
        int num = input.nextInt();
        System.out.println("Please enter those doubles.");
        double[] array = new double[num];
        for (int i = 0; i < num; i ++) {
            array[i] = input.nextDouble();
        }
        for (int i = array.length - 1; i >= 0; i --) {
            double max = array[0];
            int index = 0;
            for (int j = 0; j <= i; j ++) {
                if (array[j] > max) {
                    max = array[j];
                    index = j;
                }
            }
            array[index] = array[i];
            array[i] = max;
        }
        if (array.length % 2 == 0) {
            int firstHalf = (array.length / 2) - 1;
            int secondHalf = (array.length / 2);
            System.out.println("The median is " + (double)(array[firstHalf] + array[secondHalf])/2);
        } else {
            System.out.println("The median is " + array[array.length/2]);
        }
    }
}
