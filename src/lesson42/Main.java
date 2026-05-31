package lesson42;

public class Main {
    public static void main(String[] args) {
        int bal1 = 80;
        int bal2 = 85;
        int bal3 = 90;

        double ortalama = (bal1 + bal2 + bal3) / 3.0;

        System.out.println("1-ci imtahan balı: " + bal1);
        System.out.println("2-ci imtahan balı: " + bal2);
        System.out.println("3-cü imtahan balı: " + bal3);
        System.out.println("---------------------------");
        System.out.println("İmtahanların ortalaması: " + ortalama);
    }
}