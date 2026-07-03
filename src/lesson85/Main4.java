package lesson85;

public class Main4 {
    public static void main(String[] args) {

        System.out.println("3 ədədin cəmi: " + toplamaq(10, 20, 30));

        System.out.println("5 ədədin cəmi: " + toplamaq(5, 12, 7, 22, 3));

    }

    public static int toplamaq(int... ededler) {
        int cem = 0;

        for (int i = 0; i < ededler.length; i++) {
            cem += ededler[i];
        }

        return cem;
    }
}