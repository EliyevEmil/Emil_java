package lesson130;

public class Main {
    public static void main(String[] args) {
        Developer dev = new Developer("Əli", "Məmmədov", 1200);
        Teacher teacher = new Teacher("Aysel", "Həsənova", 450);
        Driver driver = new Driver("Rəşad", "Əliyev", 600);

        Bank bank = new Bank();

        System.out.println("--- ADİ KREDİT YOXLAMASI ---");
        bank.credit(dev, 1000);
        bank.credit(teacher, 1000);
        bank.credit(driver, 1000);

        System.out.println("\n--- XÜSUSİ KREDİT YOXLAMASI ---");
        bank.specialCredit(dev, 5000);
        bank.specialCredit(teacher, 5000);
        bank.specialCredit(driver, 5000);
    }
}