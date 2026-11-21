package lesson157;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class OrderService {
    private List<Order> orders;

    public OrderService() {
        this.orders = new ArrayList<>();
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public List<Order> getTodayOrders() {
        LocalDate today = LocalDate.now();
        List<Order> result = new ArrayList<>();
        for (Order order : orders) {
            if (order.getOrderDate().toLocalDate().equals(today)) {
                result.add(order);
            }
        }
        return result;
    }

    public double getTotalPrice() {
        double total = 0.0;
        for (Order order : orders) {
            total += order.getPrice();
        }
        return total;
    }

    public List<Order> getOrdersBetweenDates(LocalDateTime start, LocalDateTime end) {
        List<Order> result = new ArrayList<>();
        for (Order order : orders) {
            LocalDateTime date = order.getOrderDate();
            if (!date.isBefore(start) && !date.isAfter(end)) {
                result.add(order);
            }
        }
        return result;
    }
}