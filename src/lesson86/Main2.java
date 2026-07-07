package lesson86;

public class Main2 {

    static class Telebe {
        String ad;
        int sinifNomresi;
        double ortaQiymet;

        void melumat() {
            System.out.println("Ad: " + ad);
            System.out.println("Sinif: " + sinifNomresi);
            System.out.println("Orta qiymət: " + ortaQiymet);
        }

        boolean kechiblimi() {
            if (ortaQiymet > 50) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static void main(String[] args) {
        Telebe telebe = new Telebe();

        telebe.ad = "Əli";
        telebe.sinifNomresi = 7;
        telebe.ortaQiymet = 85.5;

        telebe.melumat();
        System.out.println("Keçib: " + telebe.kechiblimi());
    }
}