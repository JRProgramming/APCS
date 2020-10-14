import java.util.Scanner;
public class Problem1 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many MyInts would you like to create?");
        MyInt[] array = new MyInt[input.nextInt()];
        int[] intArray = new int[array.length];
        for (int i = 0; i < array.length; i ++) {
            int num = (int)(Math.random()*100) + 1;
            intArray[i] = num;
            array[i] = new MyInt(num);
        }
        int index = 0;
        for (MyInt integer: array) {
            System.out.print(intArray[index] + " has factors of ");
            for (int factor: integer.factors) {
                System.out.print(factor + " ");
            }
            System.out.println();
            index ++;
        }
        System.out.println("GCF's:");
        for (int i = 0; i < array.length; i ++) {
            for (int j = i + 1; j < array.length; j ++) {
                System.out.println(intArray[i] + " " + intArray[j] + " - " + array[i].gcf(array[j]));
            }
        }
        System.out.println("LCM’s:");
        for (int i = 0; i < array.length; i ++) {
            for (int j = i + 1; j < array.length; j ++) {
                System.out.println(intArray[i] + " " + intArray[j] + " - " + array[i].lcm(array[j]));
            }
        }
    }
}

class MyInt
{
 	int [] factors;//contains all factors
 	boolean prime;//self explanatory
 	int [] multiples;//contains the first 100 multiples
 
 	MyInt(int x)
 	{
       	//x is the integer
        //fill in so that data fields are correct
        prime = true;
        int factorsCount = 0;
        for (int i = 1; i <= x; i ++) {
            if (x % i == 0) {
                factorsCount ++;
                prime = false;
            }
        }
        factors = new int[factorsCount];
        factorsCount = 0;
        for (int i = 1; i <= x; i ++) {
            if (x % i == 0) {
                factors[factorsCount] = i;
                factorsCount ++;
            }
        }
        multiples = new int[100];
        int origNum = x;
        for (int i = 0; i < multiples.length; i ++) {
            multiples[i] = x;
            x += origNum;
        }
 	}
 
 	int lcm(MyInt x)
 	{
        //returns the lcm of the calling MyInt and x.
        for (int i = 0; i < multiples.length; i ++) {
            for (int j = 0; j < x.multiples.length; j ++) {
                if (x.multiples[j] == multiples[i]) {
                    return x.multiples[j];
                }
            }
        }
        return 1;
 	}
 
 	int gcf(MyInt x)
 	{
        for (int i = factors.length - 1; i >= 0; i --) {
            for (int j = x.factors.length - 1; j >= 0; j --) {
                if (x.factors[j] == factors[i]) {
                    return x.factors[j];
                }
            }
        }
        return 1;
       	//returns the gcf of the calling MyInt and x.
 	}
}
 
