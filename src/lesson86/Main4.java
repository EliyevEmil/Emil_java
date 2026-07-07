package lesson86;

public class Main4 {

    static class Kitab {
        String kitabAdi;
        String muellif;
        int sehifeySayi;
        double qiymet;

        void bilgiGoster() {
            System.out.println("Kitab Adı: " + kitabAdi);
            System.out.println("Müəllif: " + muellif);
            System.out.println("Səhifə Sayı: " + sehifeySayi);
            System.out.println("Qiymət: " + qiymet);
        }

        boolean qalinKitabmi() {
            if (sehifeySayi > 200) {
                return true;
            } else {
                return false;
            }
        }

        double endirimliQiymet(int faiz) {
            return qiymet - (qiymet * faiz / 100);
        }
    }

    public static void main(String[] args) {
        Kitab kitab = new Kitab();

        kitab.kitabAdi = "Səfillər";
        kitab.muellif = "Viktor Hüqo";
        kitab.sehifeySayi = 350;
        kitab.qiymet = 12.5;

        kitab.bilgiGoster();
        System.out.println("Qalın kitabdır: " + kitab.qalinKitabmi());
        System.out.println("20% endirimli qiymət: " + kitab.endirimliQiymet(20));
    }
}