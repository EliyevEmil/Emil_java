package lesson97;

public class Main {

    static void deyis(int x) {
        x = 100;
        System.out.println("Metod icinde: " + x);
    }

    public static void main(String[] args) {
        int a = 5;
        deyis(a);
        System.out.println("Main-de: " + a);
    }
}