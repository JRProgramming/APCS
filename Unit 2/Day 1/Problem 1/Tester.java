public class Tester {
    public static void main (String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(5);
        System.out.println(Circle.numCircles);
    }
}
class Circle {

    int radius;
    int xCenter;
    int yCenter;
    String color;
    static int numCircles;

    public Circle () {
        numCircles ++;
    }
    public Circle (int radius) {
        numCircles ++;
        this.radius = radius;
    }
    public Circle(int x, int y, int r)
  	{
        	numCircles++;
        	xCenter = x;
        	yCenter = y;
        	radius = r;
  	}
  	public Circle(int x, int y, int r, String c)
  	{
        	numCircles++;
        	xCenter = x;
        	yCenter = y;
        	radius = r;
        	color = c;
  	}
    public double getArea() {
        return Math.pow(this.radius, 2) * Math.PI;
    }
    public double getCircumference() {
        return this.radius * 2 * Math.PI;
    }
}