import java.util.Scanner;

public class Problem4 {
    public static void main (String[] args) {
        int num = 39999;
        int[] array = new int[5];
        while (true) {
            num ++;
            int numOfFactors = 0;
            array = new int[5];
            for (int i = 2; i <= num / 2; i ++) {
                if (num % i == 0) {
                    boolean valid = true;
                    for (int j = 2; j <= i / 2; j ++) {
                        if (i % j == 0) {
                            valid = false;
                            break;
                        }
                    }
                    if (valid) {
                        array[numOfFactors] = i;
                        numOfFactors ++;
                    }
                }
            }
            int product = 1;
            if (numOfFactors == 5) {
                for (int e: array) {
                    product *= e;
                }
                if (product == num) {
                    break;
                }
            } 
        }
        System.out.println("The number is " + num);
        System.out.print("The factors are: ");
        for (int e: array) {
            System.out.print(e + ", ");
        }
    }
}