public class SavingsAccount extends Account {
  double monthlyInterestRate;
  double monthlyInterestPayment;

  public double getMonthlyInterestRate() {
    return monthlyInterestRate;
  }

  public void setMonthlyInterestRate(double monthlyInterestRate) {
    this.monthlyInterestRate = monthlyInterestRate;
  }

  //double balance;


  SavingsAccount(double balance,double monthlyInterestRate){
    super(balance);
      this.monthlyInterestRate=monthlyInterestRate;
  }


    public double getMonthlyInterestPayment() {
        return monthlyInterestPayment;
    }

//    public double payment(int monthlyInterestPayment){
//      this.monthlyInterestPayment=monthlyInterestPayment;
//      return this.balance + this.monthlyInterestPayment;
//
//    }

}
