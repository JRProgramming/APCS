import java.util.Scanner;

public class Problem2 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int[] factors = new int[18];
        int num = 1;
        int index = 0;
        while (true) {
            for (int i = 0; i < factors.length; i ++) {
                factors[i] = 0;
            }
            for (int i = 1; i <= num; i ++) {
                if (num % i == 0) {
                    factors[index] = i;
                    index ++;
                }
            }
            boolean notFilled = false;
            for (int factor: factors) {
                if (factor == 0) {
                    notFilled = true;
                    break;
                }
            }
            if (notFilled) {
                num ++;
                index = 0;
                continue;
            }
            break;
        }
        System.out.println("The integer is " + num);
        for (int factor: factors) {
            System.out.print(factor + " ");
        }
    }
}