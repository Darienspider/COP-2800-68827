import java.util.*;

public class App {
    public static void main(String[] args) {
        /*2.5 (Financial application: calculate tips) Write a program that reads the subtotal and the gratuity rate, then computes the gratuity and total.
        For example, if the user enters 10 for subtotal and 15% for gratuity rate, the program displays $1.5 as gratuity and $11.5 as total.*/
        float total;
        float subtotal;
        float gratuity;
        
        // prompt user for subtotal of bill
        System.out.println("Please provide subtotal of bill: ");
        // grab input value 
        Scanner input = new Scanner (System.in);
        // save value to subtotal
        subtotal = input.nextFloat();

        // prompt for gratuity rate (whole number) 
        System.out.println("Please provide gratuity rate: ");
        // grab value of rate 
        input = new Scanner (System.in);
        // save value to rate 
        gratuity = input.nextFloat();
        // convert rate to decimal for easier calulation 
        float gratuity_rate = gratuity /100;
        float gratuityAmount = (subtotal*gratuity_rate);
        System.out.println("The gratuity: $"+gratuityAmount);

        total = (subtotal) + gratuityAmount;
        System.out.println("The total: $" + total);

    }
}
