package lesson113;

class CashPayment extends Payment {
    @Override
    void processPayment() {
        System.out.println("Nağd şəkildə " + amount + " məbləğində ödəniş qəbul edildi");
    }
}