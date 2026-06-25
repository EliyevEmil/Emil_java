package lesson79;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] massiv1 = {45, 12, 89, 5, 23};
        int[] massiv2 = {45, 12, 89, 5, 23};

        int n = massiv1.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (massiv1[j] > massiv1[j + 1]) {
                    int temp = massiv1[j];
                    massiv1[j] = massiv1[j + 1];
                    massiv1[j + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(massiv1));

        Arrays.sort(massiv2);

        System.out.println(Arrays.toString(massiv2));
    }
}