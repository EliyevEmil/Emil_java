package lesson152;

import java.util.Scanner;

public class HexToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hexadecimal ədəd daxil edin: ");
        String hex = scanner.nextLine();
        int decimal = Integer.parseInt(hex, 16);
        System.out.println("Decimal: " + decimal);
    }
}