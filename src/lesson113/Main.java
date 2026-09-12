package lesson113;

public class Main {
    public static void main(String[] args) {

        CreditCardPayment kart = new CreditCardPayment();
        kart.amount = 150.50;
        kart.processPayment();

        CashPayment nagd = new CashPayment();
        nagd.amount = 45.0;
        nagd.processPayment();

    }
}