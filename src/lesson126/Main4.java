package lesson126;

import java.util.Scanner;

public class Main4 {

    public static double kvadratSahesi(double teref) throws Exception {
        if (teref < 0) {
            throw new Exception("Kvadratın tərəfi mənfi ola bilməz!");
        }
        return teref * teref;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Kvadratın tərəfini daxil edin: ");
            double teref = scanner.nextDouble();

            double sahe = kvadratSahesi(teref);
            System.out.println("Kvadratın sahəsi: " + sahe);

        } catch (Exception e) {
            System.out.println("Xəta: " + e.getMessage());
        }

    }
}