package lesson98;

public class Main2 {
    public static void main(String[] args) {
        int[] ededler = {10, 25, 30, 45, 50, 60};

        int uzunluq = ededler.length;

        if (uzunluq % 2 == 1) {
            int ortaIndeks = uzunluq / 2;
            System.out.println("Orta indeks: " + ortaIndeks);
            System.out.println("Orta ədəd: " + ededler[ortaIndeks]);
        } else {
            int ortaIndeks1 = (uzunluq / 2) - 1;
            int ortaIndeks2 = uzunluq / 2;

            System.out.println("Orta indekslər: " + ortaIndeks1 + " və " + ortaIndeks2);
            System.out.println("Orta ədədlər: " + ededler[ortaIndeks1] + " və " + ededler[ortaIndeks2]);
        }
    }
}