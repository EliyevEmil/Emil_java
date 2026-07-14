package lesson95;

public class Main5 {
    public static void main(String[] args) {
        double ort1 = ortalama(10, 20);
        System.out.println("İki ədədin ortalaması: " + ort1);

        double ort2 = ortalama(10, 20, 35);
        System.out.println("Üç ədədin ortalaması: " + ort2);

        int[] qiymetler = {80, 90, 85, 100};
        double ort3 = ortalama(qiymetler);
        System.out.println("Massivin ortalaması: " + ort3);
    }

    public static double ortalama(int a, int b) {
        return (double) (a + b) / 2;
    }

    public static double ortalama(int a, int b, int c) {
        return (double) (a + b + c) / 3;
    }

    public static double ortalama(int[] arr) {
        if (arr.length == 0) {
            return 0.0;
        }
        int cem = 0;
        for (int eded : arr) {
            cem += eded;
        }
        return (double) cem / arr.length;
    }
}