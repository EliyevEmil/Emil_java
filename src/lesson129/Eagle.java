package lesson129;

public class Eagle implements Eatable, Flyable, Soundable {
    @Override
    public void eat() {
        System.out.println("Qartal ovunu yeyir.");
    }

    @Override
    public void fly() {
        System.out.println("Qartal göydə yüksəklərdə uçur.");
    }

    @Override
    public void makeSound() {
        System.out.println("Qartal qışqırır: Cıııv!");
    }
}