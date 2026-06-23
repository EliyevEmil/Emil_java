package lesson76;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sozu daxil edin: ");
        String word = scanner.nextLine();

        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }

        if (word.equalsIgnoreCase(reversed)) {
            System.out.println("Bu soz polindromdur.");
        } else {
            System.out.println("Bu soz polindrom deyil.");
        }
    }
}