package lesson41;

public class Main {
    public static void main(String[] args) {
        int mövcudStok = Integer.MAX_VALUE;
        int yeniGələnMəhsul = 100;

        System.out.println("Mövcud Stok: " + mövcudStok);
        System.out.println("Yeni Gələn Məhsul: " + yeniGələnMəhsul);
        System.out.println("Toplamağa çalışırıq...");

        int cəm = Math.addExact(mövcudStok, yeniGələnMəhsul);
        System.out.println("Nəticə: " + cəm);
    }
}