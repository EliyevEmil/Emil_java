package lesson4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci ədədi daxil edin: ");
        double a = scanner.nextDouble();

        System.out.print("İkinci ədədi daxil edin: ");
        double b = scanner.nextDouble();

        System.out.print("Üçüncü ədədi daxil edin: ");
        double c = scanner.nextDouble();

        if (a >= b && a >= c) {
            System.out.println("Ən böyük ədəd: " + a);
        } else if (b >= a && b >= c) {
            System.out.println("Ən böyük ədəd: " + b);
        } else {
            System.out.println("Ən böyük ədəd: " + c);
        }
    }
}