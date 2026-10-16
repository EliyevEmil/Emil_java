package lesson143;

import java.util.List;
import java.util.stream.Collectors;

public class Main3 {
    public static void main(String[] args) {
        List<Integer> ededler = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> cutEdedler = ededler.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("Cüt ədədlər: " + cutEdedler);

        List<String> adlar = List.of("ali", "veli", "leyla", "anar");
        List<String> boyukAdlar = adlar.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println("Böyük hərflərlə adlar: " + boyukAdlar);
    }
}