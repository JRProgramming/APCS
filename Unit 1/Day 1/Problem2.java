import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = input.next();
        for (int i = word.length() - 2; i > 0; i --) {
            System.out.print(word.charAt(i) );
        }
    }
}
