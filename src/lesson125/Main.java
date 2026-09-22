package lesson125;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== MASSİV TAPŞIRIĞI ===");
        int[] ededler = {10, 20, 30, 40, 50};

        System.out.print("Massivdən bir indeks seçin (0 ilə 4 arası): ");
        try {
            int indeks = scanner.nextInt();
            System.out.println("Seçdiyiniz element: " + ededler[indeks]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Xəta: Belə bir indeks massivdə yoxdur!");
        } catch (InputMismatchException e) {
            System.out.println("Xəta: Zəhmət olmasa indeks üçün tamsayı ədəd yazın!");
            scanner.nextLine();
        }

        System.out.println("\n-----------------------------------\n");

        System.out.println("=== BÖLMƏ TAPŞIRIĞI ===");
        try {
            System.out.print("Birinci ədədi daxil edin: ");
            int eded1 = scanner.nextInt();

            System.out.print("İkinci ədədi daxil edin: ");
            int eded2 = scanner.nextInt();

            int netice = eded1 / eded2;
            System.out.println("Bölmənin nəticəsi: " + netice);

        } catch (InputMismatchException e) {
            System.out.println("Düzgün ədəd daxil edin");
        } catch (ArithmeticException e) {
            System.out.println("Xəta: Ədədi sıfıra bölmək olmaz!");
        }

        scanner.close();
    }
}