package lesson65;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Mətni daxil edin: ");
        String text = scanner.nextLine();

        int length = text.length();
        String upperText = text.toUpperCase();

        System.out.println("Simvol sayı: " + length);
        System.out.println("Böyük hərflərlə: " + upperText);

        System.out.println();

        System.out.print("Email ünvanınızı daxil edin: ");
        String email = scanner.nextLine();

        if (email.contains("@") && email.contains(".")) {
            System.out.println("Email formatı doğrudur.");
        } else {
            System.out.println("Səhv email formatı! @ və . işarələri olmalıdır.");
        }
    }
}