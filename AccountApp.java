import java.util.Scanner;

public class AccountApp {


    public static void main(String[] args) {
        Double checkingAmount;
        Double savingsAmount;
        Double checkingFee;
        Double interestRate;
        Scanner scan = new Scanner(System.in);

        String[] s = new String[4];
        System.out.print("Enter initial Checking amount: ");
        checkingAmount = scan.nextDouble();
        System.out.print("Enter initial Savings amount: ");
        savingsAmount = scan.nextDouble();
        System.out.print("Enter Checking fee: ");
        checkingFee = scan.nextDouble();
        System.out.print("Enter Savings interest rate: ");
        interestRate = scan.nextDouble();

        System.out.println("\nOK! This is your information");
        System.out.printf("Checking amount: $%.2f", checkingAmount);
        System.out.printf("\nSavings amount: $%.2f", savingsAmount);
        System.out.printf("\nChecking fee: $%.2f", checkingFee);
        System.out.println("\nInterest rate: " + interestRate * 100 + "%");

        CheckingAccount ca = new CheckingAccount(checkingAmount, checkingFee);
        SavingsAccount sa = new SavingsAccount(savingsAmount, interestRate);

        System.out.println("\nEnter transactions for the month.");
        System.out.println(" ");
        boolean done = false;
        while (!done) {
            System.out.print("Withdrawal or deposit? (w/d): ");
            Scanner sc = new Scanner(System.in);
            s[0] = sc.next();

            System.out.print("Checking or Savings? (c/s): ");
            sc = new Scanner(System.in);
            s[1] = sc.next();

            System.out.print("Amount? $");
            sc = new Scanner(System.in);
            s[2] = sc.next();

            System.out.print("\nContinue? (y/n): ");
            sc = new Scanner(System.in);
            s[3] = sc.next();
            if (s[0].equals("w")) {
                if (s[1].equals("c")) {
                    ca.withdraw(Double.parseDouble(s[2]));
                } else if (s[1].equals("s")) {
                    sa.withdraw(Double.parseDouble(s[2]));
                }

            } else if (s[0].equals("d")) {
                if (s[1].equals("c")) {
                    ca.deposit(Double.parseDouble(s[2]));
                } else if (s[1].equals("s")) {
                    sa.deposit(Double.parseDouble(s[2]));
                }

            }
            if (s[3].equals("y")) {

            } else if (s[3].equals("n")) {
                break;
            }
        }

        System.out.println("\nMonthly Payments and Fees");
        System.out.printf("Checking fee: $%.2f", ca.getMonthlyFee() * ca.getNum());
        System.out.printf("\nSavings interest payment: $%.2f", sa.getBalance() * sa.getMonthlyInterestRate());

        System.out.println("\n\nFinal Balances");
        System.out.printf("Checking: $%.2f\n", ca.getBalance());
        System.out.printf("Savings: $%.2f", sa.getBalance() + (sa.getBalance() * sa.getMonthlyInterestRate()));

    }
}
