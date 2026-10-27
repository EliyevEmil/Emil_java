package lesson152;

import java.util.Scanner;

public class ShiftOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ədədi (n) daxil edin: ");
        int n = scanner.nextInt();
        System.out.print("Shift miqdarını (m) daxil edin: ");
        int m = scanner.nextInt();

        System.out.println("Sol shift (n << m): " + (n << m));
        System.out.println("Sağ shift (n >> m): " + (n >> m));
    }
}