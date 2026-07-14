package lesson94;

public class Main6 {
    public static void main(String[] args) {
        int[] qiymetler = {85, 92, 78, 95, 88};

        int cem = massivCemi(qiymetler);
        double ortalama = massivOrtalama(qiymetler);

        System.out.println("Massivin cəmi: " + cem);
        System.out.println("Massivin ortalaması: " + ortalama);
    }

    public static int massivCemi(int[] arr) {
        int cem = 0;
        for (int eded : arr) {
            cem += eded;
        }
        return cem;
    }

    public static double massivOrtalama(int[] arr) {
        if (arr.length == 0) {
            return 0.0;
        }
        int cem = massivCemi(arr);
        return (double) cem / arr.length;
    }
}