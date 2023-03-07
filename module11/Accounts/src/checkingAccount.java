public class checkingAccount extends Account{


    private double overdraftLimit;

    public checkingAccount(int accountId, double initialBalance) {
        super(accountId, initialBalance);
        //TODO Auto-generated constructor stub
    }

    public void setOverdraftlimit(double overdraftlimit){
        this.overdraftLimit = overdraftlimit;
    }

    public double getOverdraftLimit(){
        return this.overdraftLimit;
    }

    @Override
    public void withdraw(double withdrawAmount){
        if(withdrawAmount <= (this.getBalance() + this.overdraftLimit)){
            this.balance -= withdrawAmount;
        } else {
            System.out.println("Exceeded Overdraft Limit");
        }
    }
}