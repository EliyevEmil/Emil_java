package lesson147;

public class Cinema {
    private int availableTickets = 10;

    public synchronized void sellTicket(String cashierName) {
        if (availableTickets > 0) {
            availableTickets--;
            System.out.println(cashierName + " 1 bilet satdı. Qalan bilet: " + availableTickets);
        } else {
            System.out.println(cashierName + " bilet satmağa çalışdı, lakin bilet qalmayıb");
        }
    }
}