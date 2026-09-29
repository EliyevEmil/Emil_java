package lesson131;

public class Main {
    public static void main(String[] args) {
        Employee manager = new Manager("Əli", 3000.0);
        Employee developer = new Developer("Leyla", 2000.0);

        System.out.println("--- Menecer Məlumatı ---");
        System.out.println("Ad: " + manager.getName());
        System.out.println("Maaş: " + manager.getSalary() + " AZN");
        System.out.println("Bonus (20%): " + manager.calculateBonus() + " AZN");

        System.out.println("\n--- Tərtibatçı Məlumatı ---");
        System.out.println("Ad: " + developer.getName());
        System.out.println("Maaş: " + developer.getSalary() + " AZN");
        System.out.println("Bonus (10%): " + developer.calculateBonus() + " AZN");
    }
}