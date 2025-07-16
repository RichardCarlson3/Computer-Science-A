public class SavingsAccount extends Account {   
    private double apr;

    public SavingsAccount(int idNumber, double startBal, double annualInterest){
        super(idNumber,startBal);
        apr=annualInterest;
    }
    public void withdraw(double withdrawal){
        if(withdrawal<=currentBalance()&&withdrawal>0){
            decreaseBalance(withdrawal);
        }
    }
    public double monthlyInterest(){
        return (currentBalance()*apr)/12;
    }
}
