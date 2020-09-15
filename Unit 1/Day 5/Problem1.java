import java.util.Scanner;

public class Problem1 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter integers to be summed.");
        int sum = 0;
        int num =  input.nextInt();
        while (num != 0) {
            sum = addSum(sum, num);
            num = input.nextInt();
        }
        System.out.println("The sum is " + sum);
    }
    public static int addSum (int sum, int num) {
        sum += num;
        return sum;
    }
}