package lesson37;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Zəhmət olmasa ilkin maaş məbləğini daxil edin: ");
        double userSalary = scanner.nextDouble();
        System.out.println("İlkin maaş: " + userSalary + " AZN");
        System.out.println("----------------------------------------");

        userSalary += 500;
        System.out.println("Maaşa 500 AZN əlavə edildi (+=). Yeni balans: " + userSalary + " AZN");

        userSalary -= 200;
        System.out.println("Maaşdan 200 AZN çıxıldı (-=). Yeni balans: " + userSalary + " AZN");

        userSalary *= 2;
        System.out.println("Maaş 2 dəfə artırıldı (*=). Yeni balans: " + userSalary + " AZN");

        userSalary /= 4;
        System.out.println("Maaş 4-ə bölündü (/=). Son balans: " + userSalary + " AZN");
    }
}