import java.util.Scanner;

public class Problem2 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive integer.");
        int num = input.nextInt();
        String statement = isPrime(num) ? num + " is prime." : num + " is not prime";
        System.out.println(statement);
    }
    public static boolean isPrime (int num) {
        if (num <= 2) {
            return true;
        }
        for (int i = 2; i < num; i ++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
