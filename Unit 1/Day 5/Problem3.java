import java.util.Scanner;

public class Problem3 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = input.nextInt();
        System.out.println("Enter the number of columns");
        int columns = input.nextInt();
        System.out.println("Enter the integers.");
        int[][] array = new int[rows][columns];
        for (int i = 0; i < array.length; i ++) {
            for (int j = 0; j < array[i].length; j ++) {
                array[i][j] = input.nextInt();
            }
        }
        System.out.println("THe range of integers is " + twoDimRange(array));
    }
    public static int twoDimRange (int[][] array) {
        int max = array[0][0];
        int min = array[0][0];
        for (int[] row: array) {
            for (int num: row) {
                if (max < num) {
                    max = num;
                }
                if (min > num) {
                    min = num;
                }
            }
        }
        return max - min;
    }
}