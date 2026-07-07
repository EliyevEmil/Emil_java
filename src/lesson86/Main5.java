package lesson86;

public class Main5 {

    static class Duzbucaqli {
        double en;
        double uzunluq;

        double saheHesabla() {
            return en * uzunluq;
        }

        double perimetrHesabla() {
            return 2 * (en + uzunluq);
        }

        boolean kvadratmi() {
            if (en == uzunluq) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static void main(String[] args) {
        Duzbucaqli forma = new Duzbucaqli();

        forma.en = 5.0;
        forma.uzunluq = 5.0;

        System.out.println("Sahə: " + forma.saheHesabla());
        System.out.println("Perimetr: " + forma.perimetrHesabla());
        System.out.println("Kvadratdır: " + forma.kvadratmi());
    }
}