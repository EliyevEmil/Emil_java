package lesson105;

public class Main13 {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(500);
        BankAccount acc2 = new BankAccount(1200);

        System.out.println("--- İlk vəziyyət ---");
        acc1.showAccountInfo("Əli");
        acc2.showAccountInfo("Aysel");

        BankAccount.bankName = "ABB";

        System.out.println("\n--- Bank adı dəyişdirildikdən sonra ---");
        acc1.showAccountInfo("Əli");
        acc2.showAccountInfo("Aysel");
    }
}