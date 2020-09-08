import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer");
        int number = input.nextInt();
        System.out.println("The sum from 1 to " + number + ": " + sumUpTo(number));
    }
    public static int sumUpTo(int num) {
        if (num == 1) {
            return 1;
        }
        return num + sumUpTo(num - 1);
    }
}
