package lesson127;

public class Main {

    public static void checkBook(Book book) throws BookException {
        if (book == null) {
            throw new BookException("Book obyekti null ola bilməz!");
        }
        if (book.price < 0) {
            throw new BookException("Kitabın qiyməti 0-dan kiçik ola bilməz!");
        }
        if (book.name == null || book.name.trim().isEmpty()) {
            throw new BookException("Kitabın adı boş və ya null ola bilməz!");
        }

        System.out.println("Kitab məlumatları düzgündür: " + book.name);
    }

    public static void main(String[] args) {

        try {
            Book book1 = new Book("Fiqurlar", "Müəllif", -15.0);
            checkBook(book1);
        } catch (BookException e) {
            System.out.println("Xüsusi Xəta Tutuldu: " + e.getMessage());
        }

        try {
            Book book2 = null;
            checkBook(book2);
        } catch (BookException e) {
            System.out.println("Xüsusi Xəta Tutuldu: " + e.getMessage());
        }

        try {
            Book book3 = new Book("", "Müəllif", 20.0);
            checkBook(book3);
        } catch (BookException e) {
            System.out.println("Xüsusi Xəta Tutuldu: " + e.getMessage());
        }

    }
}