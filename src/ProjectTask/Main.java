package ProjectTask;

public class Main {
    public static void main(String[] args) {
        try {
            BankAccount account = new BankAccount(-100.0);
        } catch (InsufficientBalanceException e) {
            System.out.println("Xeta: " + e.getMessage());
        }
        try {
            BankAccount account2 = new BankAccount(500.0);
            account2.deposit(200.0);
            account2.deposit(400.0);
        } catch (InsufficientBalanceException e) {
            System.out.println("Xeta: " + e.getMessage());
        }
    }
}
