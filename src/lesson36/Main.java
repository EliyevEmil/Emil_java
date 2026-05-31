package lesson36;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci ədədi daxil edin: ");
        double a = scanner.nextDouble();

        System.out.print("İkinci ədədi daxil edin: ");
        double b = scanner.nextDouble();

        System.out.println("Toplama (+): " + (a + b));
        System.out.println("Çıxma (-): " + (a - b));
        System.out.println("Vurma (*): " + (a * b));
        System.out.println("Bölmə (/): " + (a / b));
        System.out.println("Qalıq (%): " + (a % b));
    }
}