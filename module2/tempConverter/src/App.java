import java.util.*;

public class App {  
/*
 * 2.1 (Convert Celsius to Fahrenheit) Write a program that reads a Celsius degree in a double value from the console, 
 * then converts it to Fahrenheit and displays the result. The formula for the conversion is as follows:
 * fahrenheit = (9 / 5) * celsius + 32
 * Hint: In Java, 9 / 5 is 1, but 9.0 / 5 is 1.8.
 */
    public static void main(String[] args){
        double fahrenheit;
        double celsius;
        System.out.println("Please enter the Celsius in Degrees: ");
        Scanner scanner = new Scanner(System.in);
         celsius = scanner.nextDouble();
        System.out.println("The temperature is set to " +celsius);
        fahrenheit = (9/5) * celsius + 32;
        System.out.println("For the Celsius of "+ celsius + ", the temperature in fahrenheit is "+ fahrenheit);
    }
}
