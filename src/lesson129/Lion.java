package lesson129;

public class Lion implements Eatable, Runnable, Soundable {
    @Override
    public void eat() {
        System.out.println("Şir ət yeyir.");
    }

    @Override
    public void run() {
        System.out.println("Şir sürətlə qaçır.");
    }

    @Override
    public void makeSound() {
        System.out.println("Şir nərildəyir: Rrrr-oar!");
    }
}