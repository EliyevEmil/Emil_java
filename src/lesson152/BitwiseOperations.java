package lesson152;

import java.util.Scanner;

public class BitwiseOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci ədədi daxil edin: ");
        int a = scanner.nextInt();
        System.out.print("İkinci ədədi daxil edin: ");
        int b = scanner.nextInt();

        System.out.println("AND (&): " + (a & b));
        System.out.println("OR (|): " + (a | b));
        System.out.println("XOR (^): " + (a ^ b));
    }
}