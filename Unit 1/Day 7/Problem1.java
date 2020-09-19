import java.util.Scanner;

public class Problem1 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a double.");
        double num = input.nextDouble();
        System.out.println("Enter the number of decimal places.");
        int decimals = input.nextInt();
        double sqrt = Math.sqrt(num);
        int number = (int)(sqrt * Math.pow(10, decimals));
        double temp = sqrt * Math.pow(10, decimals) * 10;
        boolean roundUp = temp % 10 >= 5;
        if (roundUp) {
            number += 1;
        }
        double ans = number / Math.pow(10, decimals);
        System.out.println("The square root of " + num + " is " + ans);
    }
}