package lesson105;

public class Main4 {
    static int count;

    static void show() {
        System.out.println("Say: " + count);
    }

    public static void main(String[] args) {
        Main4.count = 10;
        Main4.show();
    }
}