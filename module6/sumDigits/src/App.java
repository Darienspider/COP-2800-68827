import java.util.*;

class sumDigits {
  /*
   * 6.2 (Sum the digits in an integer) Write a method that computes the sum of
   * the digits in an integer. Use the following method header:
   * 
   * public static int sumDigits(long n)
   * 
   * --------------------------------------------------------------------
   * 
   * For example, sumDigits(234) returns 9 (2 + 3 + 4).
   * 
   * (Hint: Use the % operator to extract digits, and the / operator to remove the
   * extracted digit. For instance, to extract 4 from 234, use 234 % 10 (= 4). To
   * remove 4 from 234, use 234 / 10 = 23).
   * 
   * Use a loop to repeatedly extract and remove the digit until all the digits
   * are extracted. Write a test program
   */

  public static void main(String[] args) {
    // prompt for number
    System.out.println("Please enter a number: ");
    // grab entered number
    Scanner userInput = new Scanner(System.in);
    // save the chosen number
    int chosenNumber = userInput.nextInt();
    // close the resource leak
    userInput.close();
    // provide the chosen number to the sumdigits method
    int sum = sumDigits(chosenNumber);
    // display the answer
    System.out.println("The sum of the digits of " + chosenNumber + " is " + sum);
  }

  public static int sumDigits(int numberHere) {
    // create a storage for the answer
    int answer = 0;
    // iterate over the number by converting the number to string then grabbing
    // length of the string
    for (int i = 0; i < Integer.toString(numberHere).length(); i++) {
      // use the division formula provided, shave off extra
      double exported = (numberHere / Math.pow(10, i) % 10);
      // round to the nearest whole number
      exported = Math.round(exported);
      // add to answer, this will also convert it to answers datatype
      answer += exported;
    }
    return answer;
  }

}