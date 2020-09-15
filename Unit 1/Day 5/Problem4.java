import java.util.Scanner;

public class Problem4 {
    public static void main (String[] args) {
        int num = 39999;
        while (true) {
            num ++;
            int numOfFactors = 0;
            boolean valid = false;
            for (int i = 2; i <= num / 2; i ++) {
                if (num % i == 0) {
                    valid = true;
                    for (int j = 2; j <= i / 2; j ++) {
                        if (i % j == 0) {
                            valid = false;
                            break;
                        }
                    }
                    if (valid) {
                        numOfFactors ++;
                    }
                }
            }
            if (numOfFactors == 5) {
                break;
            }
        }
        System.out.println("The number is " + num);
    }
}