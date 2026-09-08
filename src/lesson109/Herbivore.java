package lesson109;

public class Herbivore extends Animal {
    public Herbivore(String ad, int yas, String ses) {
        super(ad, yas, ses);
    }

    @Override
    public void sesCixar() {
        System.out.println(getAd() + " səs çıxarır: " + getSes() + "!");
    }

    @Override
    public void yemVer() {
        System.out.println(getAd() + "-a ot verildi. Ot yeyən yeməyini yeyir!");
    }
}