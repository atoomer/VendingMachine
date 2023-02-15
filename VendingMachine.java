import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class VendingMachine {
    public static void main(String[]args)
    {
        String[] snacks = new String[] { "Doritos", "Flaming Hot Cheetos", "Skittles", "Cheez Its", "Gummy Bears" };
        double[] prices = new double[] { 2.99, 2.99, 3.50, 2.50, 1.20 };
        System.out.println("Welcome to the vending machine of your dreams!");

        Scanner scan = new Scanner(System.in);
        System.out.println("Please insert money. This machine only accepts $1 bills");
        int credit = scan.nextInt();
        System.out.println("$"+credit+" in credit available.");
        System.out.println("Please make your selection: ");
        
        Set<Integer> validSelections = new HashSet<>();
        for (int i = 0; i < snacks.length; i++) {
            String index = String.valueOf(i + 1);
            System.out.println(index + ") " + snacks[i] + " - $" + String.format("%.2f", prices[i]));
            if (prices[i] < credit) {
                validSelections.add(i + 1);
            }
        }
        System.out.println((snacks.length + 1) + ") Quit");
        System.out.println("What is your selection?");
        int userSelection = scan.nextInt();
        if (userSelection == snacks.length + 1) {
            System.out.println("Goodbye!");
            System.exit(0);
        }
        while (!validSelections.contains(userSelection)) {
            if (userSelection < 1 || userSelection > snacks.length) {
                System.out.println("That selection is invalid -- please enter a valid selection");
            }
            else if (prices[userSelection - 1] > credit) {
                System.out.println("You do not have enough credit available for this selection -- please try again");
            }
            userSelection = scan.nextInt();
        } 
        
    }
    
}
