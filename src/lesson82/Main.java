package lesson82;

public class Main {
    public static void main(String[] args) {

        int[] ededler = {23, 5, 89, 41, 12, 7, 95, 3};

        int max = ededler[0];
        int min = ededler[0];

        for (int i = 1; i < ededler.length; i++) {
            if (ededler[i] > max) {
                max = ededler[i];
            }
            if (ededler[i] < min) {
                min = ededler[i];
            }
        }

        System.out.println(max);
        System.out.println(min);
    }
}