package lesson87;

public class Main5 {

    static class Oyuncu {
        String ad;
        int xal;

        Oyuncu(String ad, int xal) {
            this.ad = ad;
            this.xal = xal;
        }

        void xalArtir(int elave) {
            this.xal = this.xal + elave;
        }

        void goster() {
            System.out.println(ad + ": " + xal + " xal");
        }
    }

    public static void main(String[] args) {
        Oyuncu[] oyuncular = new Oyuncu[5];
        oyuncular[0] = new Oyuncu("Əli", 70);
        oyuncular[1] = new Oyuncu("Vəli", 80);
        oyuncular[2] = new Oyuncu("Aysel", 75);
        oyuncular[3] = new Oyuncu("Nigar", 90);
        oyuncular[4] = new Oyuncu("Kamran", 85);

        oyuncular[0].xalArtir(15);
        oyuncular[1].xalArtir(12);
        oyuncular[2].xalArtir(3);
        oyuncular[3].xalArtir(5);
        oyuncular[4].xalArtir(3);

        for (int i = 0; i < oyuncular.length; i++) {
            oyuncular[i].goster();
        }

        Oyuncu qalib = oyuncular[0];
        for (int i = 1; i < oyuncular.length; i++) {
            if (oyuncular[i].xal > qalib.xal) {
                qalib = oyuncular[i];
            }
        }

        System.out.println("----------------");
        System.out.println("Qalib: " + qalib.ad + " - " + qalib.xal + " xal!");
    }
}