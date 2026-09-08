package lesson109;

public abstract class Animal implements Feedable {
    private String ad;
    private int yas;
    private String ses;

    public Animal(String ad, int yas, String ses) {
        this.ad = ad;
        this.yas = yas;
        this.ses = ses;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        if (yas >= 0) {
            this.yas = yas;
        } else {
            System.out.println("Yaş mənfi ola bilməz!");
        }
    }

    public String getSes() {
        return ses;
    }

    public void setSes(String ses) {
        this.ses = ses;
    }

    public abstract void sesCixar();
}