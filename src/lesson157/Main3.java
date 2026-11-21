package lesson157;

import java.time.LocalDateTime;

public class Main3 {
    public static void main(String[] args) {
        OrderService orderService = new OrderService();

        orderService.addOrder(new Order(1, "Keyboard", 75.0, LocalDateTime.now()));
        orderService.addOrder(new Order(2, "Mouse", 35.0, LocalDateTime.now().minusHours(2)));
        orderService.addOrder(new Order(3, "Monitor", 420.0, LocalDateTime.of(2026, 11, 10, 12, 0)));
        orderService.addOrder(new Order(4, "Headset", 90.0, LocalDateTime.of(2026, 11, 18, 16, 30)));

        System.out.println("Bugünkü sifarişlər:");
        orderService.getTodayOrders().forEach(System.out::println);

        System.out.println("\nÜmumi məbləğ: " + orderService.getTotalPrice());

        LocalDateTime start = LocalDateTime.of(2026, 11, 1, 0, 0);
        LocalDateTime end = LocalDateTime.of(2026, 11, 19, 23, 59);
        System.out.println("\nSeçilmiş tarix aralığındakı sifarişlər:");
        orderService.getOrdersBetweenDates(start, end).forEach(System.out::println);
    }
}