package software_banco;

public class SavingsAccount extends Account {
    private int numWithdrawals;

    public SavingsAccount(String accountNumber, Client owner) {
        super(accountNumber, owner);
        this.numWithdrawals = 0;
    }

    @Override
    public void withdraw(double amount) throws InvalidTransactionException {
        if (amount <= 0) {
            throw new InvalidTransactionException("Withdrawal amount must be greater than zero");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds in account");
        }
        if (numWithdrawals >= 3) {
            double fee = amount * 0.01;
            amount += fee;
            balance -= fee;
        }
        balance -= amount;
        numWithdrawals++;
    }
}