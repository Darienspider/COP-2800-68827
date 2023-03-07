import java.util.Calendar;
import java.util.Date;

public class Account {

    /*
     * Technical Requirements

        You will use the Account class you created in Assignment 9.7 and create two sub-classes for it.
        Create two subclasses for checking and saving accounts.
        A checking account has an overdraft limit
        A savings account cannot be overdrawn

     */
    private int ID;
    protected double balance;
    private double annualInterestRate = 0;
    private Date dateCreated;
    
    //constructor 
    Account (int accountId, double initialBalance){
        this.ID = accountId;
        this.balance = initialBalance;
        this.dateCreated = Calendar.getInstance().getTime();
    }

    //accessors 
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

    //requested methods
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
    }

    public void deposit(double despositAmount){
        this.balance += despositAmount;

    }
}
    // subclasses
        /*
     * Technical Requirements

        You will use the Account class you created in Assignment 9.7 and create two sub-classes for it.
        Create two subclasses for checking and saving accounts.
        A checking account has an overdraft limit
        A savings account cannot be overdrawn

     */