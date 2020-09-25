public class Tester {
    public static void main (String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(4);
        Rectangle r3 = new Rectangle(4, 2);
        Rectangle r4 = new Rectangle(4, 3, "Blue");
        System.out.println(Rectangle.numRectangles);
        r2.length = 3;
        System.out.println(r2.getArea());
    }
}
class Rectangle {

    int length;
    int width;
    String color;
    static int numRectangles;

    public Rectangle() {
        numRectangles ++;
    }
    public Rectangle (int side) {
        numRectangles ++;
        length = side;
        width = side;
    }
    public Rectangle(int length, int width) {
        numRectangles ++;
        this.length = length;
        this.width = width;
    }
    public Rectangle(int length, int width, String color) {
        this.length = length;
        this.width = width;
        this.color = color;
        numRectangles ++;
    }
    public int getArea () {
        return length * width;
    }
    public int getPerimeter () {
        return (2 * length) + (2 * width);
    }
}