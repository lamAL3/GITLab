import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // TODO A1: Ask the user how many trips they made
        // TODO A2: Create a double array with that size

        System.out.print("How many trips have you made?: ");
        int tripCount = input.nextInt();

        double[]trips = new double[tripCount];

        // TODO B1: Use a for loop to enter the gas cost for each trip
        // Example: "Enter gas cost for trip 1:"

        for (int i = 0;i < tripCount; i++){
            System.out.print("Enter gas cost for trip "+(i+1)+": ");
            trips[i] = input.nextDouble();
        }

        // TODO B2: Use another for loop to display each trip’s cost

        double totalCost=0;
        System.out.println("---Gas Expense Summary---");
        for (int i = 0;i < tripCount;i++){
            System.out.println("Trip "+(i+1)+": $"+trips[i]);
            totalCost = totalCost+trips[i];
        }

        // TODO C1: Calculate and print the total and average gas cost

        System.out.println("Total spent on gas:$ "+totalCost);
        double avgCost = totalCost/tripCount;
        System.out.println("Average per trip: $"+avgCost);
    }
}

