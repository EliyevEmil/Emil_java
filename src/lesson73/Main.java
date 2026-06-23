package lesson73;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String secretWord = "kod";

        while (true) {
            System.out.print("Sozu daxil edin: ");
            String input = scanner.nextLine();

            if (input.equals(secretWord)) {
                System.out.println("Tebrikler! Gizli sozu tapdiniz.");
                break;
            }
        }
    }
}