package lesson137;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Integer> ededler = new HashSet<>();

        ededler.add(10);
        ededler.add(15);
        ededler.add(20);
        ededler.add(25);
        ededler.add(30);

        System.out.println("İlkin kolleksiya: " + ededler);

        Iterator<Integer> iterator = ededler.iterator();

        while (iterator.hasNext()) {
            Integer eded = iterator.next();
            System.out.println("Oxunan element: " + eded);

            if (eded % 2 == 0) {
                iterator.remove();
            }
        }

        System.out.println("Cüt ədədlər silindikdən sonra kolleksiya: " + ededler);
    }
}