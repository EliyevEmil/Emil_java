package lesson153;

public class Character {
    private RunStrategy runStrategy;

    public Character(RunStrategy runStrategy) {
        this.runStrategy = runStrategy;
    }

    public void setRunStrategy(RunStrategy runStrategy) {
        this.runStrategy = runStrategy;
    }

    public void move() {
        runStrategy.run();
    }
}