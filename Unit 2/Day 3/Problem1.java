public class Problem1
{
 	public static void main(String[] args)
 	{
      	Dog d1 = new Dog();
      	Dog d2 = new Dog("Butch","Golden Retreiver");
      	Dog d3 = new Dog("Shaggy","Boxer",11,44,70);
      	d1.name = "Spot";
      	d1.breed = "Poodle";
      	d2.age = 5;
      	d1.age = 7;
      	d2.fetch = true;
      	System.out.println("We have "+Dog.numDogs+" dogs.");
      	System.out.println(d3.name+" is a "+d3.breed+". "+d3.name+" is "+d3.age+" years old, is "+d3.height+" inches tall and weighs "+d3.weight+" pounds.");
      	System.out.println("True or false? "+d2.name+" is old.");
      	System.out.println(d2.isOld()); //isOld() is a method
      	System.out.println("How old is "+d1.name+"?");
      	System.out.println(d1.name+" is "+d1.age+".");
      	System.out.println("True or false? "+d2.name+" fetches.");
      	System.out.println(d2.fetch);
      	System.out.println("True or false? "+d3.name+" fetches.");
      	System.out.println(d3.fetch);
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