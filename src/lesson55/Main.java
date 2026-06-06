package lesson55;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("1. Oyun başlat");
            System.out.println("2. Profil");
            System.out.println("3. Çıxış");
            System.out.print("Seçim edin: ");

            int secim = scan.nextInt();
            System.out.println();

            if (secim == 1) {
                System.out.println("Oyun başladılır...");
                System.out.println();
            } else if (secim == 2) {
                System.out.println("Profil məlumatları göstərilir...");
                System.out.println();
            } else if (secim == 3) {
                System.out.println("Sistemdən çıxılır. Sağ olun!");
                break;
            } else {
                System.out.println("Yanlış seçim! Yenidən cəhd edin.");
                System.out.println();
            }
        }
    }
}