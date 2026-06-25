package lesson78;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> teyyareler = new ArrayList<>();

        teyyareler.add("Boeing 777");
        teyyareler.add("Boeing 787");
        teyyareler.add("Airbus A320");

        System.out.println(teyyareler.get(0));

        teyyareler.remove(2);

        System.out.println(teyyareler.size());


        HashMap<String, String> oyunlar = new HashMap<>();

        oyunlar.put("Futbol", "Roblox Studio");
        oyunlar.put("Kodlasdirma", "IntelliJ IDEA");

        System.out.println(oyunlar.get("Futbol"));

        oyunlar.remove("Kodlasdirma");

        System.out.println(oyunlar.size());
    }
}