package lesson24;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir ədəd daxil edin: ");
        int eded = scanner.nextInt();

        String netice = (eded % 2 == 0) ? "Cüt" : "Tək";

        System.out.println("Daxil edilən ədəd: " + netice);
    }
}