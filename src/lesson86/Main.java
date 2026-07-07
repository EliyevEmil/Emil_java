package lesson86;

public class Main {

    static class Heyvan {
        String ad;
        int yas;
        String nov;

        void melumatGoster() {
            System.out.println("Ad: " + ad);
            System.out.println("Yaş: " + yas);
            System.out.println("Növ: " + nov);
        }
    }

    public static void main(String[] args) {
        Heyvan menimHeyvanim = new Heyvan();

        menimHeyvanim.ad = "Boncuk";
        menimHeyvanim.yas = 3;
        menimHeyvanim.nov = "pişik";

        menimHeyvanim.melumatGoster();
    }
}