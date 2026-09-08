package lesson110;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("AZ123456", 100.0);

        System.out.println("Cari balans: " + account.getBalance() + " AZN");

        account.deposit(50.0);
        account.deposit(-20.0);

        account.withdraw(30.0);
        account.withdraw(200.0);

        System.out.println("Yekun balans: " + account.getBalance() + " AZN");
    }
}