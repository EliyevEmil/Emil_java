package lesson110;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Başlanğıc balans mənfi ola bilməz!");
            this.balance = 0;
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " AZN hesaba əlavə olundu.");
        } else {
            System.out.println("Mənfi və ya sıfır məbləğ depozit edilə bilməz!");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Çıxarılacaq məbləğ müsbət olmalıdır!");
        } else if (amount <= balance) {
            balance -= amount;
            System.out.println(amount + " AZN hesabdan çıxarıldı.");
        } else {
            System.out.println("Kifayət qədər balans yoxdur! Cari balans: " + balance + " AZN");
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}