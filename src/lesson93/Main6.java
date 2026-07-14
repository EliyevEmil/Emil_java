package lesson93;

public class Main6 {
    public static void main(String[] args) {
        System.out.print("İki ədəddən ");
        enKicik(15, 8);

        System.out.print("Üç ədəddən ");
        enKicik3(25, 12, 43);
    }

    public static void enKicik(int a, int b) {
        if (a < b) {
            System.out.println("ən kiçiyi: " + a);
        } else {
            System.out.println("ən kiçiyi: " + b);
        }
    }

    public static void enKicik3(int a, int b, int c) {
        int keciciKicik = (a < b) ? a : b;
        enKicik(keciciKicik, c);
    }
}