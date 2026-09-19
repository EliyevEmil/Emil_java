package lesson123;

public class Main {
    public static void main(String[] args) {
        User user = new User("Emil");

        UserRepository repo = new UserRepository();
        repo.saveUser(user);

        EmailService emailService = new EmailService();
        emailService.sendEmail(user);

        InvoiceFormatter pdf = new PdfInvoiceFormatter();
        pdf.format();

        Printer printer = new SimplePrinter();
        printer.print();
    }
}