import java.util.*;

public class App {
    /*
     * *6.5 (Sort three numbers) Write a method with the following header to display three
     *  numbers in increasing order:
     * public static void displaySortedNumbers(double num1, double num2, double num3)
     * Write a test program that prompts the user to enter three numbers and 
     * invokes the method to display them in increasing order.
     */
    public static void main(String[] args) throws Exception {
        System.out.println("Please enter 3 numbers");
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter First number");
        double firstNum = userInput.nextDouble();
        
        System.out.println("Please enter Second number");
        double secondNum = userInput.nextDouble();

        System.out.println("Please enter Third number");
        double thirdNum = userInput.nextDouble();

        displaySortedNumbers(firstNum, secondNum, thirdNum);
    }

    public static void displaySortedNumbers(double num1, double num2, double num3){
        ArrayList<Double> listedNumbers = new ArrayList<Double>();
        listedNumbers.add(num1);
        listedNumbers.add(num2);
        listedNumbers.add(num3);
        listedNumbers.sort(Comparator.naturalOrder());
        System.out.println("Here is your sorted list: " + listedNumbers.toString());
        
    }
}
