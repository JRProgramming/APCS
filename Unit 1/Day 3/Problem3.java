import java.util.Scanner;

public class Problem3 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a word.");
        String word = input.next();
        for (int j = 0; j < word.length(); j ++) {
            for (int i = 0; i < (int)(Math.random()*100); i ++) {
                System.out.print(" ");
            }
            System.out.println(word.charAt(j));
        }
    }
}
