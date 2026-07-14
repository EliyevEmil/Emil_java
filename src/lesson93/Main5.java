package lesson93;

public class Main5 {
    public static void main(String[] args) {
        telebeInfo("Əli", 15, 85.5, "9-A");
        System.out.println("--------------------"); // Tələbələr arası xətt
        telebeInfo("Ayan", 12, 92.4, "7-B");
        System.out.println("--------------------");
        telebeInfo("Murad", 16, 78.0, "10-C");
    }

    public static void telebeInfo(String ad, int yas, double qiymet, String sinif) {
        System.out.println("Ad: " + ad);
        System.out.println("Yaş: " + yas);
        System.out.println("Qiymət: " + qiymet);
        System.out.println("Sinif: " + sinif);
    }
}