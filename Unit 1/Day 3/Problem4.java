import java.util.Scanner;

public class Problem4 {
    public static void main (String[] args) {
        int[][] matrix = new int [6][5];
        int max = 10;
        int min = 0;
        for (int i = 0; i < matrix.length; i ++) {
            for (int j = 0; j < matrix[i].length; j ++) {
                matrix[i][j] = (int)(Math.random()*max) + min;
            }
            min += 10;
        }
        for (int[] row: matrix) {
            for (int number: row) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}
