package lesson87;

public class Main2 {

    static class Shagird {
        String ad;
        int yas;
        int sinif;

        Shagird(String ad, int yas, int sinif) {
            this.ad = ad;
            this.yas = yas;
            this.sinif = sinif;
        }
    }

    public static void main(String[] args) {
        Shagird s1 = new Shagird("Aysel", 12, 6);
        Shagird s2 = new Shagird("Murad", 13, 7);
        Shagird s3 = new Shagird("Leyla", 11, 5);

        System.out.println(s1.ad + " - " + s1.yas + " yaş - " + s1.sinif + "-cı sinif");
        System.out.println(s2.ad + " - " + s2.yas + " yaş - " + s2.sinif + "-ci sinif");
        System.out.println(s3.ad + " - " + s3.yas + " yaş - " + s3.sinif + "-ci sinif");
    }
}