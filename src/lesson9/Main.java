package lesson9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir ədəd daxil edin: ");
        int eded = scanner.nextInt();

        String netice = switch (eded) {
            case 1 -> "Bazar";
            case 2 -> "Bazar ertəsi";
            case 3 -> "Çərşənbə axşamı";
            case 4 -> "Çərşənbə";
            case 5 -> "Cümə axşamı";
            case 6 -> "Cümə";
            case 7 -> "Şənbə";
            default -> "Yanlış ədəd";
        };

        System.out.println(netice);
    }
}