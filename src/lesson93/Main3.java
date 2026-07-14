package lesson93;

public class Main3 {
    public static void main(String[] args) {
        daireSahesi(5.0);
        daireSahesi(10.0);
        daireSahesi(2.5);
    }

    public static void daireSahesi(double radius) {
        double sahe = 3.14159 * radius * radius;
        System.out.println("Radiusu " + radius + " olan dairenin sahesi: " + sahe);
    }
}