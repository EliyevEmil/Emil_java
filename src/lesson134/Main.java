package lesson134;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        TreeSet<Integer> ededler = new TreeSet<>();

        ededler.add(50);
        ededler.add(10);
        ededler.add(30);
        ededler.add(20);
        ededler.add(40);

        System.out.println("Elementlər tək-tək (artma sırası ilə):");
        for (Integer eded : ededler) {
            System.out.println(eded);
        }

        System.out.println("\nTreeSet xüsusi metodları:");
        System.out.println("Ən kiçik element (first): " + ededler.first());
        System.out.println("Ən böyük element (last): " + ededler.last());
        System.out.println("25-dən böyük ilk element (higher): " + ededler.higher(25));
        System.out.println("25-dən kiçik ilk element (lower): " + ededler.lower(25));
        System.out.println("30-a bərabər və ya kiçik ən böyük element (floor): " + ededler.floor(30));
        System.out.println("30-a bərabər və ya böyük ən kiçik element (ceiling): " + ededler.ceiling(30));

        System.out.println("Ən kiçik elementi sil və qaytar (pollFirst): " + ededler.pollFirst());
        System.out.println("Ən böyük elementi sil və qaytar (pollLast): " + ededler.pollLast());

        System.out.println("Qalan elementlər: " + ededler);
    }
}