import java.util.Scanner;
public class Problem1 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many kids are there?");
        Kid[] kids = new Kid[input.nextInt()];
        for (int i = 0; i < kids.length; i ++) {
            System.out.println("Enter kid #" + (i + 1) + "'s name, age, and gender (m or f)");
            kids[i] = new Kid(input.next(), input.nextInt(), input.next().equals("f")); 
            System.out.println("How many sports does " + kids[i].name + " play?");
            Sport[] sports = new Sport[input.nextInt()];
            for (int j = 0; j < sports.length; j ++) {
                System.out.println("Enter the following info about sport # " + (j + 1) + ".");
                System.out.println("Sport name, Sport Season, Contact? (true or false), team? (true or false)");
                sports[j] = new Sport(input.next(), input.next(), input.nextBoolean(), input.nextBoolean());
            }
            kids[i].sports = sports;
        }
        for (Kid kid: kids) {
            System.out.println(kid.toString());
        }
        System.out.println("The average number of sports played is " + Kid.getAvgnumSport(kids));
        System.out.println("The number of kids playing at least one contact sport is " + Kid.atLeastOneContact(kids));
    }
}

class Kid {
   	int age=0;
   	String name;
   	Sport [] sports;
   	boolean female;
   	
   	Kid(String name, int age,  boolean female) {
           this.name = name;
           this.age = age;
           this.female = female;
   	}
   	
   	static double getAvgnumSport(Kid[] x) {
        int[] sportsLength = new int[x.length];
        for (int i = 0; i < x.length; i ++) {
            sportsLength[i] = x[i].sports.length;
        }
        int sum = 0;
        for (int e: sportsLength) {
            sum += e;
        }
        return (double)sum / x.length;
   	}
   	
   	static int atLeastOneContact(Kid[] x) {
        int numOfContactSports = 0;
        for (Kid kid: x) {
            for (int i = 0; i < kid.sports.length; i ++) {
                if (kid.sports[i].contact) {
                    numOfContactSports ++;
                    break;
                }
            }
        }
        return numOfContactSports;
   	}
   	
   	public String toString() {
        String sportsString = "";
        for (Sport sport: sports) {
            sportsString += sport.name + ", ";
        }
        sportsString = sportsString.substring(0, sportsString.length() - 2);
        sportsString += ".";
        return name + " a " + age + " year old " + (female ? "female" : "male") + " who plays: " + sportsString;
   	}
}
 
class Sport {
   	String name;//Name of sport
    boolean contact;//Contact sport?
   	String season;//Winter, Spring, Summer, Fall
   	boolean team;//Is it a team sport?
   	
   	Sport(String name, String season, boolean contact, boolean team) {
        this.name = name;
        this.season = season;
        this.contact = contact;
        this.team = team;
   	}
}
