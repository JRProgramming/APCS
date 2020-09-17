import java.util.Scanner;

public class Problem1 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1-Dimension or 2-Dimension?");
        int dim = input.nextInt();
        int rows = 0;
        int columns = 0;
        int length = 0;
        if (dim == 2) {
            System.out.println("Enter the number of rows and columns");
            rows = input.nextInt();
            columns = input.nextInt();
        } else {
            System.out.println("Enter the length of the array");
            length = input.nextInt();
        }
        System.out.println("Enter the min and max (inclusive)");
        int min = input.nextInt(), max = input.nextInt();
        if (dim == 2) {
            int[][] array = new int[rows][columns];
            randomFill(array, min, max);
            printArray(array);
        } else {
            int[] array = new int[length];
            randomFill(array, min, max);
            printArray(array);
        }
    }
    public static void printArray (int[] x) {
        for (int num: x) {
            System.out.print(num + " ");
        }
    }
    public static void printArray (int[][] x) {
        for (int[] row: x) {
            for (int num: row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
    public static void randomFill(int [] j, int min, int max) {
        for (int i = 0; i < j.length; i ++) {
            j[i] = (int)(Math.random()*(max-min))+min;
        }
    
 	}
 	public static void randomFill(int [][] j, int min, int max) {
        for (int k = 0; k < j.length; k ++) {
            for (int i = 0; i < j[k].length; i ++) {
                j[k][i] = (int)(Math.random()*(max-min))+min;
            }
        }
 	}
}