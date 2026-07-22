package lesson103;

public class DatabaseConnection {
    static String dbStatus;

    static {
        System.out.println("Sistem yüklənir: Verilənlər bazasına qoşulur...");
        dbStatus = "Qoşuldu";
    }

    public DatabaseConnection() {
        System.out.println("Yeni bir istifadəçi üçün bağlantı yaradıldı.");
    }
}