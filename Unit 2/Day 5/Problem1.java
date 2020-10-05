import java.util.Scanner;
public class Problem1 {
    public static void main (String[] args) {
        System.out.println(MyMath.abs(-40));
        System.out.println(MyMath.exp(2, -3));
        System.out.println(MyMath.round(-4.556, 2));
        System.out.println(MyMath.nearPerfect(1080));
    }
}
class MyMath {
    static double abs (double x) {
        //returns the absolute value of x, (very easy)
        if (x > 0) {
            return x;
        }
        return -1 * x;
    }
    static double exp (double a, int b) {
        //returns a to the b power.  b is an integer, can be positive, negative, or 0
        double base = a;
        int exp = b;
        if (exp == 0) {
            return 1;
        } else if (exp < 0) {
            exp *= -1;
        }
        int count = 1;
        while (count < exp) {
            base *= a;
            count ++;
        }
        if (b < 0) {
            return 1 / base;
        }
        return base;
    }
    static int nearPerfect (int a) {
        if (a < 0) {
            return 0;
        }
        int square = 1;
        int lowerSquare = square;
        while (square*square <= a) {
            lowerSquare = square;
            square ++;
        }
        int lowerSquareSquared = lowerSquare * lowerSquare;
        int squareSquared = square * square;
        if (a - lowerSquareSquared < squareSquared - a) {
            return lowerSquareSquared;
        }
        return squareSquared;
    }
    static double round (double a, int b) {
        int pow = 1;
        for (int i = 0; i < b; i ++) {
            pow *= 10;
        }
        pow *= 10;
        int num = (int)(a * pow);
        if (num % 10 >= 5) {
            num += 10;
        }
        num /= 10;
        pow /= 10;
        return (double)num / pow;
    }

}