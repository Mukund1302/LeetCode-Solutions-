public class CheckingAccount extends Account {
    private static Double checkingAmount;
    private double monthlyFee;
    private double bal;
    private int num = 0;
    private int CheckingAccount;

    private double balance;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public double getMonthlyFee() {
        return monthlyFee;
    }


    public void setMonthlyFee(double monthlyFee) {
        this.monthlyFee = monthlyFee;
    }

    public static Double getCheckingAmount() {
        return checkingAmount;
    }


    @Override
    public double getBalance() {
        return bal;
    }

    @Override
    public void setBalance(double balance) {
        this.balance = balance;
    }

    CheckingAccount(Double amount, Double monthlyFee) {
        super(amount);
this.bal=amount;
        this.monthlyFee = monthlyFee;
    }


    public double transaction(int transaction) {
        transaction -= monthlyFee;
        return this.balance - transaction;
    }

    @Override
    public void deposit(double amount) {
        bal+= (amount-monthlyFee);
        num += 1;

    }

    @Override
    public void withdraw(double amount) {
        bal-= (amount+monthlyFee);
        num += 1;
    }

}


