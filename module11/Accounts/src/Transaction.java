import java.util.Date;

public class Transaction{
    private Date date;
    private char type;
    private double amount;
    private double balance;
    private String description;

    Transaction(char type, double amount, double balance, String description){
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
    }

    //transaction date
    public void setDate(Date requestedDate){
        
        this.date = requestedDate;
    }

    public Date getDate(){
        return this.date;
    }

    //transaction type
    public  void setType(char requestedType){
        this.type = requestedType;
    }

    public char getType(){
        return this.type;
    }

    //transaction amount
    public void  setAmount(double requestedAmount){
        this.amount = requestedAmount;
    }

    public double getAmount(){
        return this.amount;
    }

    //balance from transaction
    public void  setBalance(double requestedBalance){
        this.balance = requestedBalance;
    }

    public double getBalance(){
        return this.balance;
    }

    //transaction description
    public void  setDescription(String requestedDescription){
        this.description = requestedDescription;
    }

    public String getDescription(){
        return this.description;
    }

    @Override
    public String toString() {
        return "{Transaction{" +
                "date=" + date +
                ", type=" + type +
                ", amount=" + amount +
                ", balance=" + balance +
                ", description='" + description + '\'' +
                "}}";
    }

}