package lesson147;

public class Cashier extends Thread {
    private Cinema cinema;
    private String cashierName;

    public Cashier(Cinema cinema, String cashierName) {
        this.cinema = cinema;
        this.cashierName = cashierName;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            cinema.sellTicket(cashierName);
            try {
                Thread.sleep(50); // Satışlar arasındakı qısa fasilə
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}