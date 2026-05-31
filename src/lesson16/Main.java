package lesson16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci ədədi daxil edin: ");
        double eded1 = scanner.nextDouble();

        System.out.print("Əməliyyatı daxil edin (+, -, *, /): ");
        String emeliyyat = scanner.next();

        System.out.print("İkinci ədədi daxil edin: ");
        double eded2 = scanner.nextDouble();

        String netice = switch (emeliyyat) {
            case "+" -> "Nəticə: " + (eded1 + eded2);
            case "-" -> "Nəticə: " + (eded1 - eded2);
            case "*" -> "Nəticə: " + (eded1 * eded2);
            case "/" -> eded2 != 0 ? "Nəticə: " + (eded1 / eded2) : "Xəta! Sıfıra bölmək olmaz.";
            default -> "Yanlış əməliyyat işarəsi daxil edilib!";
        };

        System.out.println(netice);
    }
}