package lesson127;

public class Main2 {
    public static void main(String[] args) {

        try (DatabaseConnection db = new DatabaseConnection();
             FileManager fm = new FileManager()) {

            System.out.println("Məlumat bazasına qoşulundu və fayllarla iş başlanıldı.");

        } catch (Exception e) {
            System.out.println("Xəta baş verdi: " + e.getMessage());
        }

    }
}