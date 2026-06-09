package lesson59;

public class Main {
    public static void main(String[] args) {

        int[] qiymetler = {10, 25, 30, 15};
        int cem = 0;

        for (int qiymet : qiymetler) {
            cem = cem + qiymet;
        }

        System.out.println(cem);

    }
}