package lesson111;

public class Car extends Vehicle {
    public Car(String brand, int speed) {
        super(brand, speed);
    }

    @Override
    public void move() {
        System.out.println(getBrand() + " maşını yolda " + getSpeed() + " km/saat sürətlə sürülür.");
    }
}