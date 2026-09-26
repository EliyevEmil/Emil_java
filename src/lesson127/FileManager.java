package lesson127;

public class FileManager implements AutoCloseable {

    @Override
    public void close() {
        System.out.println("Fayl meneceri uğurla bağlandı.");
    }
}