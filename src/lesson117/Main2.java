package lesson117;

public class Main2 {
    public static void main(String[] args) {
        Car car = new Car();
        car.speed = 100;

        car.start();
        car.stop();
        System.out.println("Speed: " + car.speed);
    }
}