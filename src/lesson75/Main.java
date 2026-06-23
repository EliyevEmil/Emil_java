package lesson75;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Adinizi daxil edin: ");
        String name = scanner.nextLine();

        if (name.equalsIgnoreCase("Emil")) {
            System.out.println("Xos geldin, muellim!");
        } else {
            System.out.println("Salam, " + name);
        }
    }
}