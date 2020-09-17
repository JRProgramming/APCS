import java.util.Scanner;

public class Problem2 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 2 integers.");
        int first = input.nextInt(), second = input.nextInt();
        if (triples(first, second)) {
            int[] num = findThird(first, second);
            System.out.print("The three numbers that are a part of the Pythagorean Triple are: ");
            for (int e: findThird(first, second))  {
                System.out.print(e + " ");
            }
        } else {
            System.out.println(first + " and " + second + " are not part of the Pythagorean Triple");
        }
    }
    public static boolean triples (int x, int y) {
        int min = (int)Math.min(x, y);
        int max = (int)Math.max(x, y);
        int minSquared = (int)Math.pow(min, 2);
        int maxSquared = (int)Math.pow(max, 2);
        if ((int)Math.sqrt(minSquared + maxSquared) == Math.sqrt(minSquared + maxSquared)) {
            return true;
        } else {
            for (int i = 1; i < max; i ++) {
                if (minSquared + Math.pow(i, 2) == maxSquared) {
                    return true;
                }
            }
        }
        return false;
    }
    public static int[] findThird(int q, int w){
        int min = Math.min(q, w);
        int max = Math.max(q, w);
        int minSquared = (int)Math.pow(min, 2);
        int maxSquared = (int)Math.pow(max, 2);
        if ((int)Math.sqrt(minSquared + maxSquared) == Math.sqrt(minSquared + maxSquared)) {
            // two legs
            return new int[]{ min, max, (int)Math.sqrt(minSquared + maxSquared) };
        } else {
            for (int i = 1; i < max; i ++) {
                if (minSquared + Math.pow(i, 2) == maxSquared) {
                    return new int[]{ min, i, max };
                }
            }
        }
        return null;
    }
}