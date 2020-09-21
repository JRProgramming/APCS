import java.util.Scanner;

public class Problem1 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integer");
        int num = input.nextInt();
        System.out.println("0." + num + " = " + fractionFinder(num));
    }
    public static String fractionFinder (int x) {
        int digits = 0;
        while (x / Math.pow(10, digits) >= 1) {
            digits ++;
        }
        int num = x;
        System.out.println(num);
        int denom = (int)(Math.pow(10, digits));
        System.out.println(denom);
        while (num % 5 == 0 && denom % 5 == 0) {
            num /= 5;
            denom /= 5;
        }
        while (num % 2 == 0 && denom % 2 == 0) {
            num /= 2;
            denom /= 2;
        }
        
        return num + "/" + denom;
    }
}