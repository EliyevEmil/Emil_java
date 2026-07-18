package lesson96;

public class Main3 {

    public static void main(String[] args) {
        System.out.println(cem(5));
    }

    public static int cem(int n) {
        if (n == 1) {
            return 1;
        }
        return n + cem(n - 1);
    }
}