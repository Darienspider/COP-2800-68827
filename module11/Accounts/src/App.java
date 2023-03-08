import java.util.*;

/*
 Outcome

Write a test program that creates an Account with annual interest rate 1.5%, balance 1000, id 1122, and name George.
 Deposit $30, $40, and $50 to the account and withdraw $5, $4, and $2 from the account.
Print an account summary that shows account holder name, interest rate, balance, and all transactions.

 */

public class App {
    public static void main(String[] args) throws Exception {
        Account testAccount = new Account(22,1000,"George");
        testAccount.setAnnualInterestRate(1.5);
        testAccount.deposit(30);
        testAccount.deposit(40);
        testAccount.deposit(50);

        testAccount.withdraw(5);
        testAccount.withdraw(4);
        testAccount.withdraw(2);

        testAccount.displayTransactions();


    }
}
