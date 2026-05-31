package lesson7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Gün nömrəsini daxil edin (1-7): ");
        int gunNo = scanner.nextInt();

        String gunAdi = switch (gunNo) {
            case 1 -> "Bazar";
            case 2 -> "Bazar ertəsi";
            case 3 -> "Çərşənbə axşamı";
            case 4 -> "Çərşənbə";
            case 5 -> "Cümə axşamı";
            case 6 -> "Cümə";
            case 7 -> "Şənbə";
            default -> "Yanlış gün nömrəsi! Zəhmət olmasa 1-7 arasında bir rəqəm daxil edin.";
        };

        System.out.println("Nəticə: " + gunAdi);
    }
}