package lesson95;

public class Main7 {
    public static void main(String[] args) {
        String sened = cevir(123);
        System.out.println("int-dən String-ə: " + sened);

        int say = cevir("456");
        System.out.println("String-dən int-ə: " + say);

        double kesr = cevir(5, 2);
        System.out.println("Kəsrdən double-a (5/2): " + kesr);
    }

    public static String cevir(int eded) {
        return String.valueOf(eded);
    }

    public static int cevir(String metn) {
        return Integer.parseInt(metn);
    }

    public static double cevir(int a, int b) {
        return (double) a / b;
    }
}