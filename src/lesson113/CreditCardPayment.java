package lesson113;

class CreditCardPayment extends Payment {
    @Override
    void processPayment() {
        System.out.println("Kredit kartı ilə " + amount + " məbləğində ödəniş uğurla keçdi");
    }
}