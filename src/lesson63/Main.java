package lesson63;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int cem = 0;

        while (true) {
            int eded = scanner.nextInt();

            if (eded == 0) {
                break;
            }

            if (eded < 0) {
                continue;
            }

            cem = cem + eded;
        }

        System.out.println(cem);

    }
}