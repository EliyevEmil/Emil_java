package lesson96;

public class Main8 {

    public static void main(String[] args) {
        int[] massiv = {3, 9, 2, 8, 5};
        System.out.println(enBoyuk(massiv, massiv.length - 1));
    }

    public static int enBoyuk(int[] arr, int index) {
        if (index == 0) {
            return arr[0];
        }

        int qalanlarinMaksi = enBoyuk(arr, index - 1);

        if (arr[index] > qalanlarinMaksi) {
            return arr[index];
        } else {
            return qalanlarinMaksi;
        }
    }
}