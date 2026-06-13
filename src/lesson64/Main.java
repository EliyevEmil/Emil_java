package lesson64;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book();

        book1.title = "Səfillər";
        book1.author = "Victor Hugo";
        book1.pageCount = 1232;

        System.out.println("Kitabın adı: " + book1.title);
        System.out.println("Müəllifi: " + book1.author);
        System.out.println("Səhifə sayı: " + book1.pageCount);
    }
}

class Book {
    String title;
    String author;
    int pageCount;
}