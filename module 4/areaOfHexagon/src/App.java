import java.util.*;
import java.text.DecimalFormat;
public class App {
    
//     (Geometry: Area of a hexagon) The area of a hexagon can be computed using the following formula (s is the length of a side):

// Ex4.4.PNG  
// Write a program that prompts the user to enter the side of a hexagon and displays its area. Here is a sample run:
// ************************************
// Enter the side: 5.5
// The area of the hexagon is 78.59

// ************************************
    public static void main(String[] args) throws Exception {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter the side: ");
        float side = userInput.nextFloat();
        areaCalculator(side);
    }

    public static void areaCalculator(float lengthOfSide){
        DecimalFormat formatMe = new DecimalFormat("0.00");
        double area =(6*(lengthOfSide*lengthOfSide))/ (4 * Math.tan((Math.PI / 6)));
        System.out.println("The area of the hexagon is "+ formatMe.format(area));
    }
}
