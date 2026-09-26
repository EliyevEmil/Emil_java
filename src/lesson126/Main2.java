package lesson126;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        System.out.println("=== 1. Massiv Elementinə Müraciət ===");
        int[] ededler = {10, 20, 30, 40, 50};
        int axtarilanİndex = 7;

        try {
            System.out.println("Element: " + ededler[axtarilanİndex]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Xəta: Belə bir indeks massivdə mövcud deyil!");
        }

        System.out.println();

        System.out.println("=== 2. Ədədlərin Bölünməsi ===");
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Birinci ədədi daxil edin: ");
            int eded1 = scanner.nextInt();

            System.out.print("İkinci ədədi daxil edin: ");
            int eded2 = scanner.nextInt();

            int netice = eded1 / eded2;
            System.out.println("Nəticə: " + netice);

        } catch (InputMismatchException e) {
            System.out.println("Düzgün ədəd daxil edin!");
        } catch (ArithmeticException e) {
            System.out.println("Xəta: Sıfıra bölmək olmaz!");
        }

    }
}