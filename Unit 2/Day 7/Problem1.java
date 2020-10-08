import java.util.Scanner;
public class Problem1 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of salespeople.");
        SalesPerson[] salesPersonArray = new SalesPerson[input.nextInt()];
        for (int i = 0; i < salesPersonArray.length; i ++) {
            System.out.println("Enter the salesperson's name.");
            String name = input.next();
            System.out.println("Enter " + name + "'s salary.");
            salesPersonArray[i] = new SalesPerson(name, input.nextInt());
            System.out.println("How many clients does " + name + " have?");
            salesPersonArray[i].clients = new Client[input.nextInt()];
            for (int j = 0; j < salesPersonArray[i].clients.length; j ++) {
                System.out.println("Enter client's name.");
                String clientName = input.next();
                System.out.println("Enter the budget for " + clientName + ".");
                salesPersonArray[i].clients[j] = new Client(clientName, input.nextInt());
            }
        }
        System.out.println("The salesperson with the most clients is:");
        SalesPerson mostClientSalesPerson = salesPersonArray[0];
        SalesPerson biggestBudget = salesPersonArray[0];
        for (SalesPerson salesPerson: salesPersonArray) {
            if (salesPerson.clients.length > mostClientSalesPerson.clients.length) {
                mostClientSalesPerson = salesPerson;
            }
            if (salesPerson.getBudg() > biggestBudget.getBudg()) {
                biggestBudget = salesPerson;
            }
        }
        System.out.println(mostClientSalesPerson.name + " with " + mostClientSalesPerson.clients.length);
        System.out.println("The salesperson whose clients have the biggest budget is:");
        System.out.println(biggestBudget.name + " with a total budget of " + biggestBudget.getBudg());
    }
}

class SalesPerson {
 	String name="";
 	int salary;
 	Client [] clients;
     
 	SalesPerson(String name, int salary) {
           this.name = name;
           this.salary = salary;
 	}
 	
 	int getBudg() {
         int sum = 0;
         for (Client client: clients) {
             sum += client.budget;
         }
         return sum;
 	}
}
 
class Client {
 	String name;
 	int budget;//annual spending
 	
 	Client(String name, int budget)
 	{
           this.name = name;
           this.budget = budget;
 	}
}