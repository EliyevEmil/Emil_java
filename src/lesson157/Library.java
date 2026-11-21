package lesson157;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> getBooksAfterYear(int year) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getPublishDate().getYear() > year) {
                result.add(book);
            }
        }
        return result;
    }

    public List<Book> findByAuthor(String author) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                result.add(book);
            }
        }
        return result;
    }

    public long countBooksPublishedBeforeToday() {
        LocalDate today = LocalDate.now();
        long count = 0;
        for (Book book : books) {
            if (book.getPublishDate().isBefore(today)) {
                count++;
            }
        }
        return count;
    }
}