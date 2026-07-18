package lesson97;

public class Main6 {

    static class Telebe {
        String ad;
        int yas;

        Telebe(String ad, int yas) {
            this.ad = ad;
            this.yas = yas;
        }
    }

    static void yasArtir(Telebe t) {
        t.yas = t.yas + 1;
    }

    public static void main(String[] args) {
        Telebe telebe = new Telebe("Ali", 20);
        yasArtir(telebe);
        System.out.println(telebe.yas);
    }
}