package lesson123;

public class AllInOnePrinter implements Printer, Scanner {
    @Override
    public void print() {
        System.out.println("Sənəd çap olunur...");
    }

    @Override
    public void scan() {
        System.out.println("Sənəd skan olunur...");
    }
}