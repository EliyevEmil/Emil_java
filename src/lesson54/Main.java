package lesson54;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int yanacaq = 50;

        while (yanacaq > 0) {
            System.out.print("Nece litr xerc olundu? ");
            int xerc = scan.nextInt();

            yanacaq = yanacaq - xerc;

            if (yanacaq <= 0) {
                System.out.println("Yanacaq bitdi!");
                break;
            } else {
                System.out.println("Qaldi: " + yanacaq);
                System.out.println();
            }
        }
    }
}