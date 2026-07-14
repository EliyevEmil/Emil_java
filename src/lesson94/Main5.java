package lesson94;

public class Main5 {
    public static void main(String[] args) {
        cekYaz("Telefon", 1000.0, 15.0);
    }

    public static double endirimliQiymet(double qiymet, double faiz) {
        return qiymet - (qiymet * faiz / 100);
    }

    public static void cekYaz(String mehsul, double ilkinQiymet, double faiz) {
        double yekun = endirimliQiymet(ilkinQiymet, faiz);
        System.out.println("Məhsul: " + mehsul);
        System.out.println("Qiymət: " + ilkinQiymet);
        System.out.println("Endirim: " + faiz + "%");
        System.out.println("Yekun: " + yekun);
    }
}