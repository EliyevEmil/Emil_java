package lesson128;

public class Car extends Vehicle {
    public Car(String brand, int speed) {
        super(brand, speed);
    }

    @Override
    public void move() {
        System.out.println(getBrand() + " maşını " + getSpeed() + " km/saat sürətlə yolla gedir: Vroom Vroom!");
    }
}