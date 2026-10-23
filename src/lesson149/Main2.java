package lesson149;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("16-lıq sistemdə (hexadecimal) ədəd daxil edin: ");
        String hex = scanner.nextLine();

        int decimal = Integer.parseInt(hex, 16);

        System.out.println("10-luq sistemdə (decimal): " + decimal);

        scanner.close();
    }
}