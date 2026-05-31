package lesson31;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci ədədi daxil edin: ");
        double a = scanner.nextDouble();

        System.out.print("İkinci ədədi daxil edin: ");
        double b = scanner.nextDouble();

        System.out.println("Bərabərdir? (==) -> " + (a == b));
        System.out.println("Fərqlidir? (!=) -> " + (a != b));
        System.out.println("Birinci böyükdür? (>) -> " + (a > b));
        System.out.println("Birinci kiçikdir? (<) -> " + (a < b));
    }
}