import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive number");
        int number = input.nextInt();
        for (int i = 1; i < number; i += 2) {
            System.out.print(i + " ");
        }
    }
}