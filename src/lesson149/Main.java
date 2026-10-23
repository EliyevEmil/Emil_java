package lesson149;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("10-luq sistemdə ədəd daxil edin: ");
        int decimal = scanner.nextInt();

        String binary = Integer.toBinaryString(decimal);
        String octal = Integer.toOctalString(decimal);
        String hex = Integer.toHexString(decimal).toUpperCase();

        System.out.println("2-lik sistem (Binary): " + binary);
        System.out.println("8-lik sistem (Octal): " + octal);
        System.out.println("16-lıq sistem (Hexadecimal): " + hex);

        scanner.close();
    }
}