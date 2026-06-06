package lesson57;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int secret = 7;

        while (true) {
            System.out.print("Reqemi tap: ");
            int texmin = scan.nextInt();

            if (texmin < secret) {
                System.out.println("Boyuk yazmisan.");
                System.out.println();
            } else if (texmin > secret) {
                System.out.println("Kicik yazmisan.");
                System.out.println();
            } else {
                System.out.println("Tapdin!");
                break;
            }
        }
    }
}