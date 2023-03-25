package software_banco;

public class ExcessiveWithdrawalsException extends InvalidTransactionException {
    public ExcessiveWithdrawalsException(String message) {
        super(message);
    }
}