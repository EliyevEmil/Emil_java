package lesson83;

public class Main {
    public static void main(String[] args) {

        int[] massiv1 = {1, 3, 5};
        int[] massiv2 = {2, 4, 6, 8};

        int[] birlesmisMassiv = new int[massiv1.length + massiv2.length];

        for (int i = 0; i < massiv1.length; i++) {
            birlesmisMassiv[i] = massiv1[i];
        }

        for (int i = 0; i < massiv2.length; i++) {
            birlesmisMassiv[massiv1.length + i] = massiv2[i];
        }

        System.out.println(birlesmisMassiv.length);
    }
}