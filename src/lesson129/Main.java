package lesson129;

public class Main {
    public static void main(String[] args) {
        Eagle eagle = new Eagle();
        Lion lion = new Lion();
        Fish fish = new Fish();

        System.out.println("--- QARTAL ---");
        eagle.eat();
        eagle.fly();
        eagle.makeSound();

        System.out.println("\n--- ŞİR ---");
        lion.eat();
        lion.run();
        lion.makeSound();

        System.out.println("\n--- BALIQ ---");
        fish.eat();
        fish.swim();
    }
}