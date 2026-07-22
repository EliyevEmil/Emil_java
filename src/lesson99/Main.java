package lesson99;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bank Proqramı Başladı!\n");

        BankMember member1 = new BankMember("Ali");
        BankMember member2 = new BankMember("Vəli");

        member1.deposit(500);
        member2.deposit(300);

        BankMember.showTotalBalance();
    }
}