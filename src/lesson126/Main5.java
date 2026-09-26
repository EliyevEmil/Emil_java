package lesson126;

public class Main5 {

    public static void checkBook(Book book) {
        try {
            if (book == null) {
                throw new NullPointerException("Book obyekti null ola bilməz!");
            }
            if (book.price < 0) {
                throw new IllegalArgumentException("Kitabın qiyməti 0-dan kiçik ola bilməz!");
            }
            if (book.name == null || book.name.trim().isEmpty()) {
                throw new IllegalArgumentException("Kitabın adı boş və ya null ola bilməz!");
            }

            System.out.println("Kitab məlumatları düzgündür: " + book.name);

        } catch (NullPointerException | IllegalArgumentException e) {
            System.out.println("Xəta: " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        Book book1 = new Book("Fiqurlar", "Müəllif", -15.0);
        checkBook(book1);

        Book book2 = null;
        checkBook(book2);

        Book book3 = new Book("", "Müəllif", 20.0);
        checkBook(book3);

    }
}