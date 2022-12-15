import java.util.*;
public class App {
    /**4.13 (Vowel or consonant?) Write a program that prompts the user to enter a letter
     *  and check whether the letter is a vowel or consonant. Here is a sample run:
     * 
     * Enter a letter: B
     * B is a consonant
     * 
     * Enter a letter grade: a
     * a is a vowel
     * 
     * Enter a letter grade: #
     * # is an invalid input
     * 
     */
    public static void main(String[] args) throws Exception {
        // System.out.println("Please enter a charecter: ");
        // Scanner input = new Scanner(System.in);
        // String userInput = input.nextLine();
        // detectChar(userInput);
        int x=4;
        int y=5;

        System.out.println((int)Math.random() * 4);
}

    public static void detectChar(String userinput){
        userinput = userinput.toLowerCase();
        // unable to use "||" as Mr. Fiskey said not to... so trying "case switching"
        char loweredInput = userinput.toCharArray()[0];
        // we're going to use a switch so we dont have to write so many if statements
        switch(userinput){
            case "a":
                    System.out.println(String.format("%s is a vowel", loweredInput));
                    break;
            case "e":
                    System.out.println(String.format("%s is a vowel", loweredInput));
                    break;
            case "i":
                    System.out.println(String.format("%s is a vowel", loweredInput));
                    break;

            case "o":
                    System.out.println(String.format("%s is a vowel", loweredInput));
                    break;

            case "u":
                    System.out.println(String.format("%s is a vowel", loweredInput));
                    break;

            case "y":
                    System.out.println(String.format("%s is a vowel", loweredInput));
                    break;
            default:
        //     checks if the charecter entered is an acutal letter or something else:
                if (Character.isAlphabetic(userinput.toCharArray()[0])){
                    System.out.println(String.format("%s is a consonant", loweredInput));
                }else{
                    System.out.println(String.format("%s is an invalid input", userinput));

                }

                
        }
    }



}
