package lesson111;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("BMW", 220);
        Vehicle bike = new Bike("BMX", 25);
        Vehicle plane = new Plane("Boeing", 900);

        car.move();
        bike.move();
        plane.move();
    }
}