import java.util.Scanner;
public class VendingMachine {
    public static void main(String[]args)
    {
        String[] snacks = new String[] { "Doritos", "Flaming Hot Cheetos", "Skittles", "Cheez Its", "Gummy Bears" };
        double[] prices = new double[] { 2.99, 2.99, 3.50, 2.50, 1.20 };
        System.out.println("Welcome to the vending machine of your dreams!");

        Scanner scan = new Scanner(System.in);
        System.out.println("Please tell how much money you are inserting.");
        double credit = scan.nextDouble(); 
        System.out.println("$"+credit+" in credit available.");
        
    }
    
}
