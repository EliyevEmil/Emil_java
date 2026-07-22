package lesson105;

public class Main {
    static int counter = 0;

    public Main() {
        counter = counter + 1;
        System.out.println("Yeni oyunçu gəldi! İndi cəmi: " + counter);
    }

    public static void main(String[] args) {
        Main adam1 = new Main();
        Main adam2 = new Main();
        Main adam3 = new Main();

        System.out.println("Sonda cəmi neçə adam var? -> " + Main.counter);
    }
}