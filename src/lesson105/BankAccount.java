package lesson105;

public class BankAccount {
    static String bankName = "Kapital Bank";
    double accountBalance;

    public BankAccount(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void showAccountInfo(String ownerName) {
        System.out.println("Bank: " + bankName + " | Hesab sahibi: " + ownerName + " | Balans: " + accountBalance + " AZN");
    }
}