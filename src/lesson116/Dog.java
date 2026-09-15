package lesson116;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
        System.out.println("Dog constructor işə düşdü");
    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Dog barks");
    }
}