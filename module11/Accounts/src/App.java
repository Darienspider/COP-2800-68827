import java.util.*;


public class App {
    public static void main(String[] args) throws Exception {

        checkingAccount myCheckingAccount = new checkingAccount(1234, 1000.00);
        myCheckingAccount.setOverdraftlimit(500.00);
        myCheckingAccount.withdraw(1500.00); // prints "Exceeded Overdraft Limit"
        
        savingsAccount mySavingsAccount = new savingsAccount(5678, 2000.00);
        mySavingsAccount.withdraw(2500.00); // prints "Insufficient Funds"
    }
}
