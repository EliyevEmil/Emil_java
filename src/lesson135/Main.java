package lesson135;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, Integer> xallar = new HashMap<>();

        xallar.put("Emil", 95);
        xallar.put("Seid", 88);
        xallar.put("Ali", 75);

        System.out.println("Emilin xalı: " + xallar.get("Emil"));

        xallar.put("Ali", 82);

        System.out.println("Seid var? " + xallar.containsKey("Seid"));
        System.out.println("100 xalı var? " + xallar.containsValue(100));

        xallar.remove("Ali");

        System.out.println("Ölçüsü: " + xallar.size());

        for (Map.Entry<String, Integer> qeyd : xallar.entrySet()) {
            System.out.println(qeyd.getKey() + " -> " + qeyd.getValue());
        }

        xallar.clear();
        System.out.println("Boşdur? " + xallar.isEmpty());
    }
}