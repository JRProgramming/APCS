import java.util.Scanner;

public class Problem1 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive integer.");
        int num = input.nextInt();
        for (int i = 1; i <= num; i ++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
