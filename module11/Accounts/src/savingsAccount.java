public class savingsAccount extends Account{

    public savingsAccount(int accountId, double initialBalance) {
        super(accountId, initialBalance);
        //TODO Auto-generated constructor stub
    }
    
    @Override
    public void withdraw(double withdraw){
        if(withdraw > this.balance){
            System.out.println("insufficient funds. ");
        }else{
            this.balance -= withdraw;

        }
    }
}