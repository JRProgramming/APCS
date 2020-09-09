import java.util.Scanner;

public class Problem2 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int number = (int)(Math.random()*100);
        int count = 1;
        System.out.println("Guess the number on [0,100).");
        int guess = input.nextInt();
        while (guess != number) {
            count += 1;
            if (guess > number) {
                System.out.println("Too high");
                guess = input.nextInt();
            } else if (guess < number) {
                System.out.println("Too low");
                guess = input.nextInt();
            }
        }
        System.out.println("Correct, that took " + count + " guesses.");
    }
}
