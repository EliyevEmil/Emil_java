package lesson133;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> sozler = new ArrayList<>();
        ArrayList<Integer> ededler = new ArrayList<>();

        sozler.add("Roblox");
        sozler.add("Java");
        sozler.add("Minecraft");
        sozler.add("Python");

        ededler.add(50);
        ededler.add(10);
        ededler.add(30);
        ededler.add(20);

        sozler.set(1, "C++");
        ededler.set(0, 100);

        System.out.println("Sözlər listində 0-cı element: " + sozler.get(0));
        System.out.println("Ədədlər listində 1-ci element: " + ededler.get(1));

        sozler.remove(3);
        ededler.remove(Integer.valueOf(30));

        System.out.println("Sözlər listinin ölçüsü: " + sozler.size());
        System.out.println("Ədədlər listinin ölçüsü: " + ededler.size());

        System.out.println("'Minecraft' sözünün indeksi: " + sozler.indexOf("Minecraft"));
        System.out.println("100 ədədinin indeksi: " + ededler.indexOf(100));

        Collections.sort(sozler);
        Collections.sort(ededler);

        System.out.println("Sözlər listinin son vəziyyəti: " + sozler);
        System.out.println("Ədədlər listinin son vəziyyəti: " + ededler);
    }
}