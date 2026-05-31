package lesson32;

public class Main {
    public static void main(String[] args) {
        int x;

        x = 5;
        System.out.println("x++ nəticəsi (əvvəl çap edir, sonra artırır): " + (x++));
        System.out.println("x-in hazırkı dəyəri: " + x);
        System.out.println("---------------------------------");

        x = 5;
        System.out.println("++x nəticəsi (əvvəl artırır, sonra çap edir): " + (++x));
        System.out.println("x-in hazırkı dəyəri: " + x);
        System.out.println("---------------------------------");

        x = 5;
        System.out.println("x-- nəticəsi (əvvəl çap edir, sonra azaldır): " + (x--));
        System.out.println("x-in hazırkı dəyəri: " + x);
        System.out.println("---------------------------------");

        x = 5;
        System.out.println("--x nəticəsi (əvvəl azaldır, sonra çap edir): " + (--x));
        System.out.println("x-in hazırkı dəyəri: " + x);
    }
}