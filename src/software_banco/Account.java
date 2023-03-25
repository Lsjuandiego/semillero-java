package software_banco;

public abstract class Account {
    protected String accountNumber;
    protected double balance;
    protected Client owner;

    public Account(String accountNumber, Client owner) {
        this.accountNumber = accountNumber;
        this.balance = 0;
        this.owner = owner;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public Client getOwner() {
        return owner;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new InvalidTransactionException("Deposit amount must be greater than zero");
        }
        balance += amount;
    }

    public abstract void withdraw(double amount) throws InvalidTransactionException;
}