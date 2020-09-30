import java.util.Scanner;
public class Problem2 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many squares would you like to enter?");
        int squareCount = input.nextInt();
        Square[] array = new Square[squareCount];
        for (int i = 0; i < array.length; i ++) {
            System.out.println("Enter x, y, length, and true/false for filled.");
            array[i] = new Square(input.nextInt(), input.nextInt(), input.nextInt(), input.nextBoolean());
        }
        System.out.println("Enter a point to check.");
        int x = input.nextInt(), y = input.nextInt();
        Square[] contained = new Square[squareCount];
        int index = 0;
        for (Square square: array) {
            if (square.contains(x, y)) {
                contained[index] = square;
                index ++;
            }
        }
        System.out.println(index + " squares contain (" + x + "," + y + ")");
        for (int i = 0; i < index; i ++) {
            System.out.println(contained[i].toString());
        }
    }
}
class Square {
    int xCenter;
    int yCenter;
    int length;
    boolean filled;
    public Square() {

    }
    public Square(int xCenter, int yCenter, int length, boolean filled) {
        this.xCenter = xCenter;
        this.yCenter = yCenter;
        this.length = length;
        this.filled = filled;
    } 
    public int getArea() {
        return length * length;
    }
    public int getPerimeter() {
        return 4*length;
    }
    public String toString() {
        return "Center: (" + xCenter + "," + yCenter + "), length: " + length + ", Filled? " + filled;
    }
    public boolean contains (int x, int y) {
        if (x <= xCenter + length / 2 && x >=  xCenter - length / 2 && y <= yCenter + length / 2 && y >= yCenter - length / 2) {
            return filled ? true :  x == xCenter + length / 2 || x ==  xCenter - length / 2 && y == yCenter + length / 2 || y == yCenter - length / 2;
        }
        return false;
    }
}