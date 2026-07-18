package lesson97;

public class Main3 {

    static void massivDeyis(int[] arr) {
        arr[0] = 999;
    }

    public static void main(String[] args) {
        int[] ededler = {1, 2, 3};
        massivDeyis(ededler);
        System.out.println(ededler[0]);
    }
}