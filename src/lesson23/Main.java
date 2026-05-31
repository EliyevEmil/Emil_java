package lesson23;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci ədədi daxil edin: ");
        double birinciEded = scanner.nextDouble();

        System.out.print("İkinci ədədi daxil edin: ");
        double ikinciEded = scanner.nextDouble();

        double boyukEded = (birinciEded > ikinciEded) ? birinciEded : ikinciEded;

        System.out.println("Böyük olan ədəd: " + boyukEded);
    }
}