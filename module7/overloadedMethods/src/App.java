import java.util.*;
public class App {
    /*

    7.8 (Average an array) Write two overloaded methods that return the average of 
    an array with the following headers:

    public static int average(int[] array)
    
    public static double average(double[] array)

    Write a test program that prompts the user to enter ten 
    double values, invokes this method, and displays the average value.

    */



    public static void main(String[] args) throws Exception {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please provide 10 numbers: ");
        double [] numBank = new double[9];
        for (int i = 0; i < 10; i++){
            System.out.println("Please enter Number "+(i+1) +": ");
            numBank[0] = userInput.nextDouble();
        }

        System.out.println(average(numBank));
    }

    public static int average(int[] array){
        int total = 0;
        
        for (int i : array) {
            total += array[i];
        }

        int average = total/array.length;
        return average;

    }

    public static double average(double[] array){
        double total = 0;
        for (int i = 0; i < array.length; i++){
            total += array[i] ;
        }
        
        double average = total / array.length; 

        return average;
    }



}
