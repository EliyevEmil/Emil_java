package lesson143;

import java.util.Optional;

public class Main2 {
    public static void main(String[] args) {
        Optional<String> product = Optional.of("Telefon");

        if (product.isPresent()) {
            System.out.println("Məhsul: " + product.get());
        } else {
            System.out.println("Məhsul tapılmadı");
        }

        Optional<String> phone = Optional.ofNullable(null);

        System.out.println("Nömrə: " + phone.orElse("Nömrə daxil edilməyib"));

        Optional<Integer> age = Optional.empty();

        System.out.println("Yaş: " + age.orElse(18));
    }
}