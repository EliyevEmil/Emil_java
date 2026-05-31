package lesson14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ayın nömrəsini daxil edin (1-12): ");
        int ayNo = scanner.nextInt();

        String netice = switch (ayNo) {
            case 1, 3, 5, 7, 8, 10, 12 -> "31 gün";
            case 4, 6, 9, 11 -> "30 gün";
            case 2 -> "28 və ya 29 gün";
            default -> "Yanlış ay nömrəsi! Zəhmət olmasa 1-12 arasında bir rəqəm daxil edin.";
        };

        System.out.println("Nəticə: " + netice);
    }
}