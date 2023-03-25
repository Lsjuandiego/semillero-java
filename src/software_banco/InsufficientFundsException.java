package software_banco;

public class InsufficientFundsException extends InvalidTransactionException {
    public InsufficientFundsException(String message) {
        super(message);
    }
}


