package lesson96;

public class Main2 {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("faktorial(" + i + ") = " + faktorial(i));
        }
    }

    public static int faktorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * faktorial(n - 1);
    }
}