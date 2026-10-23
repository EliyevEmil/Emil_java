package lesson149;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ədədi daxil edin (n): ");
        int n = scanner.nextInt();

        System.out.print("Shift miqdarını daxil edin (m): ");
        int m = scanner.nextInt();

        System.out.println("Sol shift (n << m): " + (n << m));
        System.out.println("Sağ shift (n >> m): " + (n >> m));

        scanner.close();
    }
}