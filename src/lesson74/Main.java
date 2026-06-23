package lesson74;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Adinizi daxil edin: ");
        String name = scanner.nextLine();

        String reversed = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            reversed += name.charAt(i);
        }

        System.out.println(reversed);
    }
}