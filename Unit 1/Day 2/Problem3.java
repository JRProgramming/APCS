import java.util.Scanner;

public class Problem3 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a word.");
        String word = input.next();
        System.out.println(swapLetters(word));
    }
    public static String swapLetters (String word) {
        int firstIndex = (int)(Math.random()*word.length());
        int secondIndex = -1;
        while(secondIndex == -1) {
            int otherIndex = (int)(Math.random()*word.length());
            if (otherIndex != firstIndex) {
                secondIndex = otherIndex;
                break;
            }
        }
        char temp = word.charAt(firstIndex);
        System.out.println(temp + " " + word.charAt(secondIndex));
        word = word.substring(0, firstIndex) + word.charAt(secondIndex) + word.substring(firstIndex + 1);
        word = word.substring(0, secondIndex) + temp + word.substring(secondIndex + 1);
        return word;
    }
}
