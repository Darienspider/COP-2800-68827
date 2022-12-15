
public class App {
    /*
     * (Conversion from miles to kilometers) Write a program that displays the following table
     *  (note that 1 mile is 1.609 kilometers):
     */
    public static void main(String[] args) throws Exception {
        calcKilometers(10);
    }

    public static void calcKilometers (double numOfMiles){
        System.out.println("Miles              Kilometers");
        for (int i =0; i<numOfMiles;i++){
            System.out.println(i + "              " + i*1.609);
        }

    }
}
