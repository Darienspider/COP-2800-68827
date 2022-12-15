import javax.naming.InitialContext;

public class App {
    /*
     * **5.7 (Financial application: compute future tuition) 
     *  Suppose that the tuition for a university is $10,000
     *  this year and increases 5% every year.
     *  In one year, the tuition will be $10,500.
     */
    static double amount = 0;
    static int initialAmount = 10000;
    static double tuitionIncrease = .05;
    public static void main(String[] args) throws Exception { 
        for (int year = 1; year < 10+1; year++){
            amount= (initialAmount) + (initialAmount*(year*tuitionIncrease) ); 
            switch(year){
                case 4:System.out.println("In year " + year+" the amount will be "+ amount);
                        break;
                
                case 10:System.out.println("In year " + year+" the amount will be "+ amount);
                        break;

            }
        }
    }
}
