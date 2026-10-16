package lesson144;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Main2 {
    public static void main(String[] args) {
        LocalDate bugun = LocalDate.now();
        System.out.println("Bugünkü tarix: " + bugun);

        LocalDate onGunSonra = bugun.plusDays(10);
        System.out.println("10 gün əlavə olunmuş tarix: " + onGunSonra);

        LocalDate verilmisTarix = LocalDate.of(2026, 6, 15);
        System.out.println("İl: " + verilmisTarix.getYear() + ", Ay: " + verilmisTarix.getMonthValue() + ", Gün: " + verilmisTarix.getDayOfMonth());

        LocalTime hazirkiSaat = LocalTime.now();
        LocalTime ikiSaatSonra = hazirkiSaat.plusHours(2);
        System.out.println("Hazırkı saata 2 saat əlavə olunub: " + ikiSaatSonra);

        LocalTime saat1 = LocalTime.of(10, 30);
        LocalTime saat2 = LocalTime.of(14, 15);
        boolean evveldir = saat1.isBefore(saat2);
        System.out.println("Saat 10:30 saat 14:15-dən əvvəldirmi? " + evveldir);

        LocalDateTime hazirkiTarixSaat = LocalDateTime.now();
        LocalDateTime ucGunEvvel = hazirkiTarixSaat.minusDays(3);
        System.out.println("Hazırkı tarixdən 3 gün çıxıldıqda: " + ucGunEvvel);

        LocalDateTime verilmisTS = LocalDateTime.of(2026, 10, 10, 15, 30);
        LocalDate yalnizTarix = verilmisTS.toLocalDate();
        System.out.println("Yalnız tarix hissəsi: " + yalnizTarix);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        String formatliMetn = verilmisTS.format(formatter);
        System.out.println("Formatlanmış tarix: " + formatliMetn);

        ZonedDateTime bakuVaxdi = ZonedDateTime.now(ZoneId.of("Asia/Baku"));
        System.out.println("Bakı vaxtı: " + bakuVaxdi);

        ZonedDateTime londonVaxdi = bakuVaxdi.withZoneSameInstant(ZoneId.of("Europe/London"));
        System.out.println("London vaxtı: " + londonVaxdi);
    }
}