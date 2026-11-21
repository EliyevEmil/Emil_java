package lesson157;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook(new Book("1984", "George Orwell", LocalDate.of(1949, 6, 8)));
        library.addBook(new Book("Səfillər", "Victor Hugo", LocalDate.of(1862, 4, 3)));
        library.addBook(new Book("Gələcəyin Kitabı", "Test Müəllif", LocalDate.of(2030, 1, 1)));

        System.out.println("1900-cü ildən sonra nəşr olunanlar:");
        library.getBooksAfterYear(1900).forEach(System.out::println);

        System.out.println("\nGeorge Orwell tərəfindən yazılanlar:");
        library.findByAuthor("George Orwell").forEach(System.out::println);

        System.out.println("\nBugünkü tarixdən əvvəl çıxan kitabların sayı: "
                + library.countBooksPublishedBeforeToday());
    }
}