package lesson99;

public class BankMember {
    String memberName;
    static double totalBankBalance = 0;

    public BankMember(String name) {
        this.memberName = name;
    }

    public void deposit(double amount) {
        totalBankBalance = totalBankBalance + amount;
        System.out.println("--- MƏDAXİL OLUNDU ---");
        System.out.println(this.memberName + " banka " + amount + " AZN qoydu!");
        System.out.println("----------------------\n");
    }

    public static void showTotalBalance() {
        System.out.println("==================================");
        System.out.println("BANKIN SEYFİNDƏ OLAN TOPLAM PUL: " + totalBankBalance + " AZN");
        System.out.println("==================================");
    }
}