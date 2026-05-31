package lesson19;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Yaşınızı daxil edin: ");
        int yas = scanner.nextInt();

        if (yas > 18) {
            System.out.println("Siz yetkinsiniz");
        } else {
            System.out.println("Siz hələ yetkin deyilsiniz");
        }
    }
}