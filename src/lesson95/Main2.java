package lesson95;

public class Main2 {
    public static void main(String[] args) {
        int cem1 = topla(5, 10);
        System.out.println("topla(5, 10) -> " + cem1);

        int cem2 = topla(4, 8, 12);
        System.out.println("topla(4, 8, 12) -> " + cem2);

        double cem3 = topla(3.5, 2.5);
        System.out.println("topla(3.5, 2.5) -> " + cem3);

        int[] ededler = {10, 20, 30, 40};
        int cem4 = topla(ededler);
        System.out.println("topla(new int[]{10, 20, 30, 40}) -> " + cem4);
    }

    public static int topla(int a, int b) {
        return a + b;
    }

    public static int topla(int a, int b, int c) {
        return a + b + c;
    }

    public static double topla(double a, double b) {
        return a + b;
    }

    public static int topla(int[] arr) {
        int cem = 0;
        for (int eded : arr) {
            cem += eded;
        }
        return cem;
    }
}