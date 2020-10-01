import java.util.Scanner;
public class Problem2 {
 	public static void main(String[] args)
 	{
          Scanner input = new Scanner(System.in);
          System.out.println("How many dogs would you like to enter?");
          Dog[] array = new Dog[input.nextInt()];
          for (int i = 0; i < array.length; i ++) {
              System.out.println("Please enter Dog #" + (i + 1) + "’s name, breed, age, height, weight, all separated by spaces.");
              array[i] = new Dog(input.next(), input.next(), input.nextInt(), input.nextInt(), input.nextInt());
          }
          Dog oldest = new Dog(), heaviest = new Dog();
          double height = 0;
          for (Dog dog: array) {
              if (oldest.age < dog.age) {
                  oldest = dog;
              }
              if (heaviest.weight < dog.weight) {
                  heaviest = dog;
              }
              height += dog.height;
          }
          System.out.println(heaviest.name + " is the heaviest dog at " + heaviest.weight + " pounds");
          System.out.println(oldest.name + " is the oldest dog at " + oldest.weight + " years old.");
          System.out.println("The average height of the dogs is " + height / array.length + " inches.");
 	}
}
class Dog {
    String name;
    String breed;
    int age;
    int height;
    int weight;
    boolean fetch;
    static int numDogs;

    public Dog() {
        numDogs ++;
    }
    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
        numDogs ++;
    }
    public Dog(String name, String breed, int age, int height, int weight) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.height = height;
        this.weight = weight;
        numDogs ++;
    }
    public boolean isOld () {
        return age >= 10;
    }
}