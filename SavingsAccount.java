public class SavingsAccount extends BankAccount {
    private final double MINIMUM_BALANCE = 1000.0;

    public SavingsAccount(String accountNumber, double initialBalance) {
        super(accountNumber, initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= MINIMUM_BALANCE) {
            balance -= amount;
            System.out.println("Successfully withdrew ₹" + amount + " from Savings Account.");
            System.out.println("Remaining Balance: ₹" + balance);
        } else {
            System.out.println("Transaction Denied! Minimum balance of ₹" + MINIMUM_BALANCE + " must be maintained.");
        }
    }
}
