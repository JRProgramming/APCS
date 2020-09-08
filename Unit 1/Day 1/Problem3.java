import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter # of rows.");
        int rows = input.nextInt();
        System.out.println("Enter # of columns.");
        int columns = input.nextInt();
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i ++) {
            for (int j = 0; j < columns; j ++) {
                matrix[i][j] = (int)(Math.random()*10);
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
