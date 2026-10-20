package lesson147;

public class Main {
    public static void main(String[] args) {
        Cinema cinema = new Cinema();

        Cashier k1 = new Cashier(cinema, "Kassir-1");
        Cashier k2 = new Cashier(cinema, "Kassir-2");
        Cashier k3 = new Cashier(cinema, "Kassir-3");

        k1.start();
        k2.start();
        k3.start();
    }
}