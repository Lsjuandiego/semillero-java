package software_banco;

public class CheckingAccount extends Account {
    private int numWithdrawals;
    private int numDeposits;
    public CheckingAccount(String accountNumber, Client owner) {
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
        if (numWithdrawals >= 5) {
            throw new ExcessiveWithdrawalsException("Exceeded maximum number of withdrawals allowed");
        }
        balance -= amount;
        numWithdrawals++;
    }

    @Override
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new InvalidTransactionException("Deposit amount must be greater than zero");
        }
        if (numDeposits < 2) {
            balance += amount + amount * 0.005; // 0.5% bonus for first 2 deposits
        } else {
            balance += amount;
        }
        numDeposits++;
    }
}