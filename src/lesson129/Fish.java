package lesson129;

public class Fish implements Eatable, Swimmable {
    @Override
    public void eat() {
        System.out.println("Balıq yem yeyir.");
    }

    @Override
    public void swim() {
        System.out.println("Balıq suda üzür.");
    }
}