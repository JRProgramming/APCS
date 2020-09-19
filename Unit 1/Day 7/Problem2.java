import java.util.Scanner;

public class Problem2 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows.");
        int rows = input.nextInt();
        System.out.println("Enter the number of columns.");
        int columns = input.nextInt();
        System.out.println("Enter the values.");
        int [][] array = new int[rows][columns];
        for (int i = 0; i < rows; i ++) {
            for (int j = 0; j < columns; j ++) {
                array[i][j] = input.nextInt();
            }
        }
        int[][] transposedArray = transpose(array);
        for (int[] row: transposedArray) {
            for (int num: row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static int[][] transpose (int[][] orig) {
        int[][] array = new int[orig.length][orig[0].length];
        for (int column = 0; column < orig[0].length; column ++) {
            for (int row = 0; row < orig.length; row ++) {
                array[row][column] = orig[row][column];
            }
        }
        return array;
    }
 
}