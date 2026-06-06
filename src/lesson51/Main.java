package lesson51;

public class Main {
    public static void main(String[] args) {
        int cem = 0;

        for (int i = 1; i <= 50; i++) {
            if (i % 4 == 0 && i % 6 == 0) {
                cem = cem + i;
            }
        }

        System.out.println(cem);
    }
}