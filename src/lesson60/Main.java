package lesson60;

public class Main {
    public static void main(String[] args) {

        int[] qiymetler = {10, 25, 30, 15, 3, 66, 78, 9, 11, 23};
        int cutCem = 0;
        int tekCem = 0;

        for (int qiymet : qiymetler) {
            if (qiymet % 2 == 0) {
                cutCem = cutCem + qiymet;
            } else {
                tekCem = tekCem + qiymet;
            }
        }

        System.out.println(cutCem);
        System.out.println(tekCem);

    }
}