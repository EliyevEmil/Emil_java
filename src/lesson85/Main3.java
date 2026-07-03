package lesson85;

import java.util.Arrays;

public class Main3 {
    public static void main(String[] args) {

        int[] reqemler = {45, 12, 89, 5, 23};

        Arrays.sort(reqemler);

        System.out.println("Sıralanmış ədədlər:");

        for (int i = 0; i < reqemler.length; i++) {
            System.out.println(reqemler[i]);
        }

    }
}