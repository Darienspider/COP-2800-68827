import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Calendar;
import java.util.Date;
import java.util.Calendar;
import java.util.Date;

public class Account {

    /*
Technical Requirements 

You will use the Account class you created in Assignment 9.7
Add a new data field name of the String type to store the name of the customer.
Add a new constructor that constructs an account with the specified name, id, and balance.
Add a new data field named transactions whose type is ArrayList that stores the transaction for the accounts.
Each transaction is an instance of the Transaction class.
Modify the withdraw and deposit methods to add a transaction to the transactions array list.
All other properties and methods are the same as in Programming Exercise 9.7.
The Transaction class is defined as shown in below:


     */
    private int ID;
    protected double balance;
    private double annualInterestRate = 0;
    private Date dateCreated;
    //Add a new data field name of the String type to store the name of the customer.
    private String customerName;
    
    //Add a new data field named transactions whose type is ArrayList that stores the transaction for the accounts.
    private ArrayList<Transaction> transactions = new ArrayList<Transaction>();




    
    Account (int accountId, double initialBalance){
        this.ID = accountId;
        this.balance = initialBalance;
        this.dateCreated = Calendar.getInstance().getTime();
    }

    //Add a new constructor that constructs an account with the specified name, id, and balance.
    Account(int accountId, double accountBalance, String customerName){
        this.ID = accountId;
        this.balance = accountBalance;
        this.customerName = customerName;
    }

    public int getID(){
        return this.ID;
    }
    
    public double getBalance(){
        return this.balance;
    }
    
    public double getannualInterestRate(){
        return this.annualInterestRate;
    }

    public Date getDateCreated(){
        return this.dateCreated;
    }
    
    //mutators
    public void setID(int ID){
        this.ID = ID;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public void setAnnualInterestRate(double AnnualinterestRate){
        this.annualInterestRate = AnnualinterestRate;
    }

    public double getMonthlyInterest(){
        double MonthlyInterest;
        MonthlyInterest = this.balance * ((this.annualInterestRate / 12)/100);
        return MonthlyInterest;
    }

    public double getMonthlyInterestRate(){
        double MonthlyInterestRate;
        MonthlyInterestRate = (this.annualInterestRate / 12);
        return MonthlyInterestRate;
    }

    public void withdraw(double withdrawAmount){
        this.balance -= withdrawAmount;
        Transaction withdrawTransaction;
        
        if (withdrawAmount > 1){
           withdrawTransaction = new Transaction('W', withdrawAmount, this.balance, customerName + " withdrew "+withdrawAmount+" dollarss");
        }else{
            withdrawTransaction = new Transaction('W', withdrawAmount, this.balance, customerName + " withdrew "+withdrawAmount+" dollar");
        }
        
        transactions.add(withdrawTransaction);

    }

    public void deposit(double despositAmount){
        this.balance += despositAmount;
        Transaction depositTransaction;
        
        if (despositAmount > 1){
            depositTransaction = new Transaction('D', despositAmount, this.balance, customerName + " withdrew "+despositAmount+" dollarss");
        }else{
            depositTransaction = new Transaction('D', despositAmount, this.balance, customerName + " withdrew "+despositAmount+" dollar");
        }

        transactions.add(depositTransaction);
    }
    
    public void displayTransactions(){
        String interestRateMsg = String.format("With Interest Rate of %s", this.getMonthlyInterestRate());
        for (int i = 0; i < transactions.size(); i++){
            System.out.println(interestRateMsg +" "+transactions.get(i));

        }
    }
}
