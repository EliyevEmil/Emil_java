package lesson53;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int password = 1234;

        while (true) {
            System.out.print("Şifrəni daxil et: ");
            int daxilEdilen = scan.nextInt();

            if (daxilEdilen == password) {
                System.out.println("Giriş uğurludur.");
                break;
            } else {
                System.out.println("Yanlış şifrə!");
                System.out.println();
            }
        }
    }
}