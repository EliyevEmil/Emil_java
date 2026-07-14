package lesson95;

public class Main4 {
    public static void main(String[] args) {
        goster(5);
        goster(3.14);
        goster("Salam");
        goster(true);
    }

    public static void goster(int eded) {
        System.out.println("Tam ədəd: " + eded);
    }

    public static void goster(double eded) {
        System.out.println("Onluq ədəd: " + eded);
    }

    public static void goster(String metn) {
        System.out.println("Mətn: " + metn);
    }

    public static void goster(boolean deger) {
        System.out.println("Boolean: " + deger);
    }
}