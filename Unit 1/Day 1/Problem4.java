import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows for a square array.");
        int rows = input.nextInt();
        int[][] matrix = new int[rows][rows];
        for (int i = 0; i < rows; i ++) {
            for (int j = 0; j < rows; j ++) {
                if (i == j) {
                    matrix[i][j] = i;
                } else if (i + j == rows - 1) {
                    matrix[j][i] = j;
                } else {
                    matrix[i][j] = 0;
                } 
            }
        }
        for (int[] row: matrix) {
            for (int number: row) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}
