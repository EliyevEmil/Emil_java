package lesson86;

public class Main3 {

    static class Hesablayici {
        int eded1;
        int eded2;

        int topla() {
            return eded1 + eded2;
        }

        int cix() {
            return eded1 - eded2;
        }

        int vur() {
            return eded1 * eded2;
        }

        double bol() {
            return (double) eded1 / eded2;
        }
    }

    public static void main(String[] args) {
        Hesablayici hesabla = new Hesablayici();

        hesabla.eded1 = 10;
        hesabla.eded2 = 3;

        System.out.println("Toplama: " + hesabla.topla());
        System.out.println("Çıxma: " + hesabla.cix());
        System.out.println("Vurma: " + hesabla.vur());
        System.out.printf("Bölmə: %.2f\n", hesabla.bol());
    }
}