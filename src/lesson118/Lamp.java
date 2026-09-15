package lesson118;

public class Lamp implements Controllable {
    @Override
    public void turnOn() {
        System.out.println("Lamp is turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Lamp is turned off");
    }
}