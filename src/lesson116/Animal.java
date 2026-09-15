package lesson116;

public class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
        System.out.println("Animal constructor işə düşdü");
    }

    public void makeSound() {
        System.out.println("Animal sound");
    }
}