import java.util.Scanner;

public class Problem2 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter two positive integers");
        int num1 = input.nextInt(), num2 = input.nextInt();
        int factor = 0;
        for (int i = 1; i < num1; i ++) {
            for (int j = 1; j < num2; j ++) {
                if (num1 % i == 0 && num2 % i == 0 && j == i) {
                    factor = i;
                }
            }
        }
        System.out.println("The greatest common factor is " + factor + ".");
    }
}
