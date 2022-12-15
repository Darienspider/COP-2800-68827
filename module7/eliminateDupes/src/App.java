import java.util.*;
public class App {
    /*
     * 7.15 (Eliminate duplicates) Write a method that returns a new array by eliminating 
     * the duplicate values in the array using the following method header:
     * public static int[] eliminateDuplicates(int[] list)
     * 
     * Write a test program that reads in ten integers, invokes the method, 
     * and displays the result. Here is the sample run of the program:
     * 
     * Enter ten numbers:,1,2,3,2,1,6,3,4,5,2
     * The distinct numbers are: 1 2 3 6 4 5
     */

        private final static Scanner scanner = new Scanner(System.in);
    
        // Driver code 
        public static void main(String[] args){
          int[] arr = new int[10];

            for(int i=0; i< 10; i++){
                // prompts the user to enter a number
                System.out.println("Please enter number "+(i+1)+": ");
                // takes the iteration number and saves it to the index of the
                arr[i] = scanner.nextInt();
            }
        { 
        //   pass the list to our method that removes duplicates
          int[] distinctIntegers = eliminateDuplicates(arr);
    
        //   create a string that will store our expored values
          String baseValues = "";
          String distValues = "";
    
          for (int val : arr) {
            //created a for each loop that takes that each item in list and converts it to a string

            baseValues = baseValues + " " + Integer.toString(val);
            // add each exported value to he base value string
          }
            //   created a for each loop that takes that each item in list and converts it to a string
            // add each exported value to he base value string
          for (int val : distinctIntegers) {
              distValues =  distValues + " " + Integer.toString(val);        
          }
    
          
          // print results
          System.out.println("The original list is: "+baseValues);

        //   removes the zeros on the end (replace the 0, with empty strings)
          System.out.println("The distinct numbers are:"+distValues.replace('0',' '));}
        }
    
        public static int[] eliminateDuplicates(int[] list) {
        //   create a new list, and set it equal to the size of the array passed as a parameter
            int[] distinctList = new int[list.length];

          int i = 0;

        //   FOR EACH item in list
          for(int e: list) {
            // if the result of linear search is -1
              if(linearSearch(distinctList, e) == -1) {
                // set the current index to the value
                  distinctList[i] = e;
                //   scan for next item in list
                  i++;
              }
          }
          return distinctList;
      }
      public static int linearSearch(int[] array, int key) {
        // iterate over array
          for(int i = 0; i < array.length; i++) {
            // if item and key are the same, return the item
              if(key == array[i])
                  return i;
          }
        //   returns -1 to have a return value (Essentially removes the error)
          return -1;
      }
    }
