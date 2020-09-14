import java.util.Scanner;

public class Problem2 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a word.");
        String word = input.next();
        System.out.println();
        int row = (int)(Math.random()*10);
        int column = (int)(Math.random()*(10 - word.length()));
        for (int i = 0; i < 10; i ++) {
            for (int j = 0; j < 10; j ++) {
                if (i != row || j < column || j >= column + word.length()) {
                    System.out.print((char)(((int)(Math.random()*26))+97));
                } else {
                    System.out.print(word);
                    j += word.length() - 1;
                }
            }
            System.out.println();
        }
    }
}