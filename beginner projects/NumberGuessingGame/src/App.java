import java.util.Random;
import java.util.Scanner;


public class App {

    public static void main(String[] args) throws Exception {
        int failedResponses = 0;
        Scanner userInput = new Scanner(System.in);
        int numRange = 100;
        boolean executed = true;


        System.out.println("Generating number between 1 and "+numRange);
        int generated_number = (int) (Math.random()*numRange)+1;
        System.out.println(generated_number);
        System.out.println("________________");
        System.out.println("Hello, welcome to my number guessing game");
        System.out.println("You will need to guess a number between 1 and "+numRange);

        while(executed){
            System.out.println("Please enter Answer:");
            if (userInput.nextInt() == generated_number){
                System.out.println("Congratulations, you guessed correctly in "+ failedResponses + " attempts");
                executed = false;
            }else{
                failedResponses+=1;
            }          

        }
    }
        
    public static Random randomNumber(int numRange){
        Random number = new Random();
        number.nextInt(numRange);
        return number;

    }
}
