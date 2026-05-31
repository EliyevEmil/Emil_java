package lesson1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci ədədi daxil edin: ");
        double birinciEded = scanner.nextDouble();

        System.out.print("İkinci ədədi daxil edin: ");
        double ikinciEded = scanner.nextDouble();

        if (birinciEded > ikinciEded) {
            System.out.println("Birinci ədəd böyükdür");
        } else {
            System.out.println("İkinci ədəd böyükdür");
        }
    }
}