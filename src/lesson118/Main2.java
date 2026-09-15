package lesson118;

public class Main2 {
    public static void main(String[] args) {
        Warrior warrior = new Warrior();
        Archer archer = new Archer();

        warrior.attack();
        archer.attack();

        Lamp lamp = new Lamp();
        Fan fan = new Fan();

        lamp.turnOn();
        lamp.turnOff();

        fan.turnOn();
        fan.turnOff();
    }
}