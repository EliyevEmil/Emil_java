package lesson6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ayın nömrəsini daxil edin (1-12): ");
        int ayNo = scanner.nextInt();

        String ifElseNetice;
        if (ayNo == 1 || ayNo == 3 || ayNo == 5 || ayNo == 7 || ayNo == 8 || ayNo == 10 || ayNo == 12) {
            ifElseNetice = "31 gün (if-else)";
        } else if (ayNo == 4 || ayNo == 6 || ayNo == 9 || ayNo == 11) {
            ifElseNetice = "30 gün (if-else)";
        } else if (ayNo == 2) {
            ifElseNetice = "28 və ya 29 gün (if-else)";
        } else {
            ifElseNetice = "Yanlış ay nömrəsi! (if-else)";
        }

        String switchNetice = switch (ayNo) {
            case 1, 3, 5, 7, 8, 10, 12 -> "31 gün (switch)";
            case 4, 6, 9, 11 -> "30 gün (switch)";
            case 2 -> "28 və ya 29 gün (switch)";
            default -> "Yanlış ay nömrəsi! (switch)";
        };

        System.out.println(ifElseNetice);
        System.out.println(switchNetice);
    }
}