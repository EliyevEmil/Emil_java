package lesson106;

import java.util.Random;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(50) + 1;
        int maxAttempts = 5;
        boolean isGuessed = false;

        System.out.println("1-dən 50-yə qədər bir ədəd tutdum. 5 cəhd haqqınız var!");

        for (int i = 1; i <= maxAttempts; i++) {
            System.out.print(i + "-ci cəhdiniz: ");
            int guess = scanner.nextInt();

            if (guess == secretNumber) {
                System.out.println("Təbriklər! Şanslı rəqəmi tapdınız!");
                isGuessed = true;
                break;
            } else if (guess > secretNumber) {
                System.out.println("Daha kiçik bir ədəd yazın.");
            } else {
                System.out.println("Daha böyük bir ədəd yazın.");
            }
        }

        if (!isGuessed) {
            System.out.println("Cəhd haqqınız bitdi! Məğlub oldunuz. Gizli ədəd: " + secretNumber + " idi.");
        }
    }
}