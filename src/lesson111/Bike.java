package lesson111;

public class Bike extends Vehicle {
    public Bike(String brand, int speed) {
        super(brand, speed);
    }

    @Override
    public void move() {
        System.out.println(getBrand() + " velosipedi " + getSpeed() + " km/saat sürətlə pedallanır.");
    }
}