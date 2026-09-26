package ProjectTask;

public class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String mesaj) {
        super(mesaj);
    }
}
