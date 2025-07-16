public class SpecialCheckingAccount extends CheckingAccount {
    private double minBal;
    private double apr;
    public SpecialCheckingAccount(int idNumber, double startBal, double checkCharge, double interestRate,double minimumBalance){
        super(idNumber,startBal,checkCharge);
        minBal=minimumBalance;
        apr=interestRate;
    }
    public void clearCheck(double amount){
        if(currentBalance()>minBal){
            decreaseBalance(amount);
        }
        else{
            super.clearCheck(amount);
        }
    }
    public double monthlyInterest(){
        if(currentBalance()>minBal){
            return (currentBalance()*apr)/12;
        }
        else{
            return super.monthlyInterest();
        }
    }

}
