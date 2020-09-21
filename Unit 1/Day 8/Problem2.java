import java.util.Scanner;

public class Problem2 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer");
        int rows = input.nextInt();
        int[][] array = new int[rows][rows];
        for (int i = 0; i < rows; i ++) {
            for (int j = 0; j <= i; j ++) {
                if (j == 0 || j == i) { 
                    System.out.print(1);
                    array[i][j] = 1;
                } else {
                    System.out.print(array[i - 1][j - 1] + array[i - 1][j]);
                    array[i][j] = array[i - 1][j - 1] + array[i - 1][j];
                }
            }
            System.out.println();
        }
    }
}