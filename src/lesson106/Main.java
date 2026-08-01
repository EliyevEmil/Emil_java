package lesson106;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Murad", 12, 45.5);

        System.out.println("--- İlkin Məlumatlar ---");
        student1.displayInfo();

        System.out.println();

        student1.increaseGrade(10.0);

        System.out.println();

        System.out.println("--- Artımdan Sonrakı Məlumatlar ---");
        student1.displayInfo();

        System.out.println();

        if (student1.isPassed()) {
            System.out.println("Təbriklər, tələbə imtahandan keçdi!");
        } else {
            System.out.println("Təəssüf ki, tələbə kəsildi.");
        }
    }
}