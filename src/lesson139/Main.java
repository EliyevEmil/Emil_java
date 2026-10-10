package lesson139;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Kitab> kitabSiyahisi = new ArrayList<>();

        kitabSiyahisi.add(new Kitab(3, "Java Dərsləri", 15.50));
        kitabSiyahisi.add(new Kitab(1, "Riyaziyyat Maraqlıdır", 10.00));
        kitabSiyahisi.add(new Kitab(2, "Fizika Sehrli Dünyadır", 12.30));

        System.out.println("--- Orijinal Siyahı ---");
        for (Kitab k : kitabSiyahisi) {
            System.out.println(k);
        }

        Collections.sort(kitabSiyahisi);
        System.out.println("\n--- ID-ə görə sıralandı (sort) ---");
        for (Kitab k : kitabSiyahisi) {
            System.out.println(k);
        }

        Collections.reverse(kitabSiyahisi);
        System.out.println("\n--- Tərsinə çevrildi (reverse) ---");
        for (Kitab k : kitabSiyahisi) {
            System.out.println(k);
        }

        Collections.shuffle(kitabSiyahisi);
        System.out.println("\n--- Qarışdırıldı (shuffle) ---");
        for (Kitab k : kitabSiyahisi) {
            System.out.println(k);
        }

        Collections.sort(kitabSiyahisi);

        Kitab enKicik = Collections.min(kitabSiyahisi);
        Kitab enBoyuk = Collections.max(kitabSiyahisi);
        System.out.println("\nƏn kiçik ID-li kitab (min): " + enKicik);
        System.out.println("Ən böyük ID-li kitab (max): " + enBoyuk);

        Kitab axtarilacaq = new Kitab(2, "", 0);
        int indeks = Collections.binarySearch(kitabSiyahisi, axtarilacaq);
        System.out.println("\nID 2 olan kitabın indeksi (binarySearch): " + indeks);

        Collections.sort(kitabSiyahisi, new QiymetUzreSirala());
        System.out.println("\n--- Qiymətə görə sıralandı (Comparator ilə sort) ---");
        for (Kitab k : kitabSiyahisi) {
            System.out.println(k);
        }
    }
}