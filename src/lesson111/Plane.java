package lesson111;

public class Plane extends Vehicle {
    public Plane(String brand, int speed) {
        super(brand, speed);
    }

    @Override
    public void move() {
        System.out.println(getBrand() + " təyyarəsi " + getSpeed() + " km/saat sürətlə havada uçur.");
    }
}