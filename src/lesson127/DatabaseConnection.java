package lesson127;

public class DatabaseConnection implements AutoCloseable {

    @Override
    public void close() {
        System.out.println("Məlumat bazası bağlantısı bağlandı.");
    }
}