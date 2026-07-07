package lesson87;

public class Main4 {

    static class Mehsul {
        String ad;
        double qiymet;
        int miqdar;

        Mehsul(String ad, double qiymet, int miqdar) {
            this.ad = ad;
            this.qiymet = qiymet;
            this.miqdar = miqdar;
        }

        double umumiQiymet() {
            return qiymet * miqdar;
        }

        void melumat() {
            System.out.printf("%s - %.2f AZN x %d = %.2f AZN\n", ad, qiymet, miqdar, umumiQiymet());
        }
    }

    public static void main(String[] args) {
        Mehsul m1 = new Mehsul("Alma", 1.50, 5);
        Mehsul m2 = new Mehsul("Çörək", 0.80, 3);
        Mehsul m3 = new Mehsul("Süd", 2.00, 2);
        Mehsul m4 = new Mehsul("Pendir", 5.00, 1);

        m1.melumat();
        m2.melumat();
        m3.melumat();
        m4.melumat();

        double umumiCem = m1.umumiQiymet() + m2.umumiQiymet() + m3.umumiQiymet() + m4.umumiQiymet();

        System.out.println("--------------------------------");
        System.out.printf("Ümumi cəm: %.2f AZN\n", umumiCem);
    }
}