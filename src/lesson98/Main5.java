package lesson98;

public class Main5 {

    static class Calculation {

        public int enBoyuk(int[] arr) {
            int max = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            return max;
        }

        public int enKicik(int[] arr) {
            int min = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                }
            }
            return min;
        }

        public void cem(int[] arr) {
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
            }
            System.out.println("Massivin cəmi: " + sum);
        }
    }

    public static void main(String[] args) {
        Calculation calc = new Calculation();
        int[] ededler = {12, 5, 89, 4, 23, 50};

        int maxElement = calc.enBoyuk(ededler);
        System.out.println("Ən böyük element: " + maxElement);

        int minElement = calc.enKicik(ededler);
        System.out.println("Ən kiçik element: " + minElement);

        calc.cem(ededler);
    }
}