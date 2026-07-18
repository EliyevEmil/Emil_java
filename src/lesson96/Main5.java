package lesson96;

public class Main5 {

    public static void main(String[] args) {
        System.out.println(quvvet(2, 5));
    }

    public static int quvvet(int esas, int us) {
        if (us == 0) {
            return 1;
        }
        return esas * quvvet(esas, us - 1);
    }
}