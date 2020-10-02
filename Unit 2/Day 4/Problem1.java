import java.util.Scanner;

public class Problem1 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many televisions do you have?");
        Television[] tvs = new Television[input.nextInt()];
        for (int i = 0; i < tvs.length; i ++) {
            System.out.println("Please enter name for tv #" + (i + 1));
            tvs[i] = new Television(input.next());
        }
        while (true) {
            for (Television tv: tvs) {
                System.out.println(tv.toString());
            }
            System.out.println("Which tv would you like to adjust?");
            for (int i = 0; i < tvs.length; i ++) {
                System.out.println("Press " + (i + 1) + " for " + tvs[i].name);
            }
            Television tv = tvs[input.nextInt() - 1];
            System.out.println("Press 1 for on/off");
            System.out.println("Press 2 to increase volume");
            System.out.println("Press 3 to decrease volume");
            System.out.println("Press 4 to increase channel");
            System.out.println("Press 5 to decrease channel");
            System.out.println("Press 6 to set channel");
            System.out.println("Press 7 to exit");
            int actionIndex = input.nextInt();
            if (actionIndex != 7) {
                switch (actionIndex) {
                case 1: 
                    tv.turnOnOff();
                    break;
                case 2: 
                    tv.volUp();
                    break;
                case 3:
                    tv.volDown();
                    break;
                case 4:
                    tv.chanUp();
                    break;
                case 5:
                    tv.chanDown();
                    break;
                case 6:
                    System.out.println("Enter channel");
                    tv.chanSel(input.nextInt());
                    break;
                }
            } else {
                break;
            }
        }
    }
}
class Television {

    String name = "";
    boolean on = false;
    int volume = 0;
    int channel = 1;

    public Television () {

    }

    public Television (String name) {
        this.name = name;
    }
    public void turnOnOff() {
        on = !on;
    }
    public void volUp() {
        if (on) {
            volume ++;
            if (volume == 101) {
                volume = 0;
            }
        }
    }
    public void volDown() {
        if (on) {
            volume --;
            if (volume == 0) {
                volume = 100;
            }
        }
    }
    public void chanUp() {
        if (on) {
            channel ++;
            if (channel == 121) {
                channel = 1;
            }
        }
    }
    public void chanDown() {
        if (on) {
            channel --;
            if (channel == 0) {
                channel = 120;
            }
        }
        
    }
    public void chanSel (int x) {
        if (on) {
            if (x >= 1 && x <= 120) {
                channel = x;
            }
        }
    }
    public String toString() {
        if (!on) {
            return name + ", " + (on ? "on" : "off");
        }
        return name + "," + (on  ? "on" : "off") + ", channel: " + channel + ", volume: " + volume;
    }
}