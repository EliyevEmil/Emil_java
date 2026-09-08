package lesson109;

public class Predator extends Animal {
    public Predator(String ad, int yas, String ses) {
        super(ad, yas, ses);
    }

    @Override
    public void sesCixar() {
        System.out.println(getAd() + " xırıldayır: " + getSes() + "!");
    }

    @Override
    public void yemVer() {
        System.out.println(getAd() + "-a ət verildi. Yırtıcı yeməyini yeyir!");
    }
}