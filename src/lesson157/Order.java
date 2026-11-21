package lesson157;

import java.time.LocalDateTime;

public class Order {
    private int id;
    private String productName;
    private double price;
    private LocalDateTime orderDate;

    public Order(int id, String productName, double price, LocalDateTime orderDate) {
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.orderDate = orderDate;
    }

    public int getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", orderDate=" + orderDate +
                '}';
    }
}