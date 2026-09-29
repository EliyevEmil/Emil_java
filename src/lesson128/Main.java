package lesson128;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", 220);
        Bike bike1 = new Bike("BMX", 25);
        Bike bike2 = new Bike("Trek", 30);

        car1.move();
        bike1.move();
        bike2.move();

        System.out.println();

        CheckVehicle.checkVehicle(car1);
        CheckVehicle.checkVehicle(bike1);
        CheckVehicle.checkVehicle(bike2);
    }
}