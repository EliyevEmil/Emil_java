package lesson87;

public class Main3 {

    static class Itci {
        String ad;
        String cins;
        int enerjisi = 100;

        void qacir() {
            enerjisi = enerjisi - 20;
            System.out.println(ad + " qaçır! Enerji: " + enerjisi);
        }

        void yeyir() {
            enerjisi = enerjisi + 30;
            System.out.println(ad + " yeyir! Enerji: " + enerjisi);
        }

        void yatir() {
            enerjisi = enerjisi + 50;
            System.out.println(ad + " yatır! Enerji: " + enerjisi);
        }
    }

    public static void main(String[] args) {
        Itci it = new Itci();
        it.ad = "Tarzan";
        it.cins = "Çoban iti";

        it.qacir();
        it.qacir();
        it.yeyir();
        it.qacir();
        it.yatir();
    }
}