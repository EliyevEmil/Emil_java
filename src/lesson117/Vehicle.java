package lesson117;

public abstract class Vehicle {
    int speed;

    public abstract void start();

    public void stop() {
        System.out.println("Vehicle stopped");
    }
}