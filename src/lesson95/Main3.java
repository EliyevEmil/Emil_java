package lesson95;

public class Main3 {
    public static void main(String[] args) {
        double daireSahe = sahe(5.0);
        System.out.println("Dairənin sahəsi: " + daireSahe);

        double duzbucaqliSahe = sahe(4.0, 6.0);
        System.out.println("Düzbucaqlının sahəsi: " + duzbucaqliSahe);

        double ucbucaqSahe = sahe(3.0, 4.0, 5.0);
        System.out.println("Üçbucağın sahəsi: " + ucbucaqSahe);
    }

    public static double sahe(double radius) {
        return Math.PI * radius * radius;
    }

    public static double sahe(double en, double uzun) {
        return en * uzun;
    }

    public static double sahe(double a, double b, double c) {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}