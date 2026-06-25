package lesson80;

public class Main {
    public static void main(String[] args) {

        int[] ededler = {12, 7, 24, 15, 8, 33, 50, 41};

        for (int i = 0; i < ededler.length; i++) {
            if (ededler[i] % 2 == 0) {
                System.out.println(ededler[i]);
            }
        }
    }
}