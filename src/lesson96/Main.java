package lesson96;

public class Main {

    public static void main(String[] args) {
        geriSay(5);
    }

    public static void geriSay(int n) {
        if (n == 0) {
            return;
        }

        System.out.print(n + " ");
        geriSay(n - 1);
    }
}