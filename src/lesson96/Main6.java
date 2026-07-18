package lesson96;

public class Main6 {

    public static void main(String[] args) {
        System.out.println(reqemCemi(1234));
    }

    public static int reqemCemi(int n) {
        if (n < 10) {
            return n;
        }
        return n % 10 + reqemCemi(n / 10);
    }
}