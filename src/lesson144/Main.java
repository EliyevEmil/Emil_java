package lesson144;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDateTime indikiVaxt = LocalDateTime.now();

        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");

        String tarixMetni = indikiVaxt.format(format);

        System.out.println("Formatlanmış tarix və vaxt: " + tarixMetni);
    }
}