import java.util.Scanner;

public class Problem2 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a dimension for a square array.");
        int num = input.nextInt();
        for (int i = 0; i < num; i ++) {
            for (int j = 0; j < num; j ++) {
                if (j == 0 || j == num - 1 || i == 0 || i == num - 1) {
                    System.out.print(0 + " ");
                } else {
                    System.out.print(1 + " ");
                }
            }
            System.out.println();
        }
    }
}
