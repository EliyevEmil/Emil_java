package lesson143;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> sozler = new ArrayList<>();
        sozler.add("roblox");
        sozler.add("java");
        sozler.add("minecraft");
        sozler.add("futbol");

        System.out.println("Köhnə siyahı: " + sozler);

        sozler.replaceAll(String::toUpperCase);

        System.out.println("Böyük hərflərlə: " + sozler);
    }
}