package lesson128;

public class Vehicle implements Movable {
    private String brand;
    private int speed;

    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public String getBrand() {
        return brand;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public void move() {
        System.out.println(brand + " sürətlə hərəkət edir!");
    }
}