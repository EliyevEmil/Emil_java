package lesson138;

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
        System.out.println("\n--- ID-ə görə sıralandı (Comparable) ---");
        for (Kitab k : kitabSiyahisi) {
            System.out.println(k);
        }

        QiymetUzreSirala qiymetComparatoru = new QiymetUzreSirala();
        Collections.sort(kitabSiyahisi, qiymetComparatoru);

        System.out.println("\n--- Qiymətə görə sıralandı (Comparator) ---");
        for (Kitab k : kitabSiyahisi) {
            System.out.println(k);
        }
    }
}