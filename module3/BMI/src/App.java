import java.util.Scanner;
public class App {
    // (Health application: BMI) Revise Listing 3.4, ComputeAndInterpretBMI.java, to let the user enter weight, feet, and inches.
    double bmi;
    int feet;
    int inches;
    double weight;
    String bmiStatus;

    public void assignVariables(int inputFeet, int inputInches, double inputWeight){
        inputFeet = feet;
        inputInches = inches;
        inputWeight = weight;
    }



    public double convertWeight(double weight){
        double weightInKilograms;
        // there are 0.45359237kgs in a pound so multiply that by the weight in lbs
        weightInKilograms = weight * 0.45359237;        
        return weightInKilograms;
    }
    
    public double convertHeight(int feet, int inches){
        double newHeight;
        // conver feet to meters; 0.3048 per foot
        double feetToMeters = feet * 0.3048;

        // conver inches to meters; 0.0254 per inch 
        double inchesToMeters = inches*0.0254;
        newHeight = feetToMeters + inchesToMeters;
        return newHeight;
    }

    public double calculateBMI(int feet, int inches, double weight){
        // formula BMI = kg/m2
        double bmi_weight = convertWeight(weight);
        double bmi_height = convertHeight(feet, inches);
        
        bmi = bmi_weight / (bmi_height * bmi_height);

        return bmi;

    }

    public String  interprateBMI(double bmi){

        if(bmi<18.5){
            bmiStatus = "Underweight";
        }else if (bmi>=18.5 && bmi<25.0){
            bmiStatus = "Normal";
        }else if (bmi>=25.0 && bmi<=30.0){
            bmiStatus = "Overweight";
        }else{
            bmiStatus = "Obese";
        }

        return bmiStatus;
    }

    

    public static void main(String[] args){
        App newUser = new App();
        Scanner input = new Scanner(System.in);

        System.out.println(" Enter Weight: ");
        double weightInput = input.nextDouble();

        System.out.println("Enter Feet: ");
        int feetInput = input.nextInt();

        System.out.println("Enter Inches: ");
        int inchesInput = input.nextInt();

        newUser.assignVariables(feetInput, inchesInput, weightInput);
        // TODO: finish calculating the BMI, i may be able to do this in a single function called calculateBMI
        newUser.calculateBMI(feetInput, inchesInput, weightInput);
        String bmiStatus = newUser.interprateBMI(newUser.bmi);
        System.out.println(newUser.bmi);
        System.out.println(bmiStatus);
    }

}
