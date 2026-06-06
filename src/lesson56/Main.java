package lesson56;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("Ədəd daxil et: ");
            int eded = scan.nextInt();

            if (eded > 0) {
                System.out.println("Qəbul edildi.");
                break;
            } else {
                System.out.println("Yalnız müsbət ədəd daxil edin.");
                System.out.println();
            }
        }
    }
}