package ProjectTask;

public class BankAccount {
    private double balance;

    public BankAccount(double balance) throws InsufficientBalanceException {
        if (balance <0){
            throw new InsufficientBalanceException("Ilkin balans menfi ola bilmez!");
        }
        this.balance = balance;
    }

    public void deposit(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Kifayet qeder balans yoxdur!");
        }
        balance -= amount;
        System.out.println("Cixarildi: " + amount + ", Qaliq balans: " + balance);
    }

    public double getBalance() {
        return balance;
    }
}
