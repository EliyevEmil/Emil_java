package lesson15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Saat daxil edin (0-23): ");
        int saat = scanner.nextInt();

        if (saat >= 6 && saat <= 11) {
            System.out.println("Səhər");
        } else if (saat >= 12 && saat <= 17) {
            System.out.println("Günorta");
        } else if (saat >= 18 && saat <= 23) {
            System.out.println("Axşam");
        } else if (saat >= 0 && saat <= 5) {
            System.out.println("Gecə");
        } else {
            System.out.println("Səhv saat yazmısınız!");
        }
    }
}