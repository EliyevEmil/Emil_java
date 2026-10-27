package lesson152;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Binary ədəd daxil edin: ");
        String binary = scanner.nextLine();
        int decimal = Integer.parseInt(binary, 2);
        System.out.println("Decimal: " + decimal);
    }
}