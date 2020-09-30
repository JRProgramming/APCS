import java.util.Scanner;
public class Problem1 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many circles would you like to enter?");
        int circles = input.nextInt();
        Circle[] array = new Circle[circles];
        for (int i = 0; i < circles; i ++) {
            System.out.println("Please enter xCenter, yCenter, radius for Circle " + (i + 1) + ", separated by spaces.");
            array[i] = new Circle(input.nextInt(), input.nextInt(), input.nextInt());
        }
        System.out.println("Please enter a point, x, y, separated by spaces.");
        int x = input.nextInt(), y = input.nextInt();
        Circle[] fit = new Circle[circles];
        int index = 0;
        for (Circle cir: array) {
            if (Math.pow(x - cir.xCenter, 2) + Math.pow(y - cir.xCenter, 2) <= Math.pow(cir.radius, 2)) {
                fit[index] = cir;
                index ++;
            }
        }
        System.out.println(index + " Circles contain (" + x + ", " + y + ")");
        for (int i = 0; i < index; i ++) {
            System.out.println("Center(" + fit[i].xCenter + "," + fit[i].yCenter + "), Radius " + fit[i].radius);
        }

    }
}

class Circle
{
  	int radius = 0;
  	int xCenter = 0;
  	int yCenter = 0;
  	String color = "";
  	static int numCircles = 0;
  	
  	
  	Circle() {
        	numCircles++;
        	
  	}
 
  	Circle(int r) {
        	numCircles++;
        	radius = r;
        	
  	}
        	
  	Circle(int x, int y, int r) {
        	numCircles++;
        	xCenter = x;
        	yCenter = y;
        	radius = r;
  	}
  	
  	Circle(int x, int y, int r, String c) {
        	numCircles++;
        	xCenter = x;
        	yCenter = y;
        	radius = r;
  	  	    color = c;
  	}
 
  	double getArea() {
        	return Math.PI*radius*radius;
  	}
  	
  	double getCircumference() {
        	return 2*Math.PI*radius;
  	}
}
