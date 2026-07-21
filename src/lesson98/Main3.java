package lesson98;

class Developer {
    String ad;
    int yas;
    double maas;

    public Developer() {
        this("Naməlum", 0, 0.0);
    }

    public Developer(String ad) {
        this(ad, 0, 0.0);
    }

    public Developer(String ad, int yas) {
        this(ad, yas, 0.0);
    }

    public Developer(String ad, int yas, double maas) {
        this.ad = ad;
        this.yas = yas;
        this.maas = maas;
    }

    public void melumatGoster() {
        System.out.println("Ad: " + ad + ", Yaş: " + yas + ", Maaş: " + maas);
    }
}

public class Main3 {
    public static void main(String[] args) {
        Developer dev1 = new Developer();
        Developer dev2 = new Developer("Əli");
        Developer dev3 = new Developer("Ləman", 25);
        Developer dev4 = new Developer("Rauf", 30, 2500.0);

        dev1.melumatGoster();
        dev2.melumatGoster();
        dev3.melumatGoster();
        dev4.melumatGoster();
    }
}