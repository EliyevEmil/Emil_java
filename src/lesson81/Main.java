package lesson81;

public class Main {
    public static void main(String[] args) {

        int[] reqemler = {5, 12, 18, 25, 4, 30, 45, 9, 14, 22};

        int cem = 0;

        for (int i = 0; i < reqemler.length; i++) {
            cem = cem + reqemler[i];
        }

        double ortalama = (double) cem / reqemler.length;

        System.out.println(cem);
        System.out.println(ortalama);
    }
}