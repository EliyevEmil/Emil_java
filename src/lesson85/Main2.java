package lesson85;

import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {

        ArrayList<String> meyveler = new ArrayList<>();

        meyveler.add("Alma");
        meyveler.add("Banan");
        meyveler.add("Çiyələk");
        meyveler.add("Portoğal");
        meyveler.add("Gilas");

        System.out.println("Kolleksiyadakı meyvələr:");

        for (int i = 0; i < meyveler.size(); i++) {
            System.out.println(meyveler.get(i));
        }

    }
}