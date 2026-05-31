package lesson3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Yaşınızı daxil edin: ");
        int yas = scanner.nextInt();

        if (yas < 0) {
            System.out.println("Yanlış yaş daxil edilib!");
        } else if (yas <= 12) {
            System.out.println("Uşaq");
        } else if (yas <= 35) {
            System.out.println("Gənc");
        } else if (yas <= 60) {
            System.out.println("Yetkin");
        } else {
            System.out.println("Qoca");
        }
    }
}