package lesson8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir ədəd daxil edin: ");
        double eded = scanner.nextDouble();

        if (eded > 0) {
            System.out.println("Daxil edilən ədəd müsbətdir.");
        } else if (eded < 0) {
            System.out.println("Daxil edilən ədəd mənfidir.");
        } else {
            System.out.println("Daxil edilən ədəd sıfırdır.");
        }
    }
}