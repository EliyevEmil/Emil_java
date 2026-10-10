package lesson139;

public class Kitab implements Comparable<Kitab> {
    private int id;
    private String ad;
    private double qiymet;

    public Kitab(int id, String ad, double qiymet) {
        this.id = id;
        this.ad = ad;
        this.qiymet = qiymet;
    }

    public int getId() {
        return id;
    }

    public String getAd() {
        return ad;
    }

    public double getQiymet() {
        return qiymet;
    }

    @Override
    public int compareTo(Kitab digerKitab) {
        return Integer.compare(this.id, digerKitab.id);
    }

    @Override
    public String toString() {
        return "Kitab [ID: " + id + ", Ad: " + ad + ", Qiymət: " + qiymet + " AZN]";
    }
}