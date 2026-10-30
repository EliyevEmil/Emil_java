package lesson153;

public class Main3 {
    public static void main(String[] args) {
        Character hero = new Character(new SlowRun());
        hero.move();

        hero.setRunStrategy(new FastRun());
        hero.move();
    }
}