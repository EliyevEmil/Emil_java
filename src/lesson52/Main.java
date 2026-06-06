package lesson52;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int eded = scan.nextInt();

        int ilkEded = eded;
        int tersEded = 0;

        while (eded > 0) {
            int qaliq = eded % 10;
            tersEded = (tersEded * 10) + qaliq;
            eded = eded / 10;
        }

        if (ilkEded == tersEded) {
            System.out.println("Polindromdur");
        } else {
            System.out.println("Polindrom deyil");
        }
    }
}