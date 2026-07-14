package lesson95;

public class Main {
    public static void main(String[] args) {
        salam();
        salam("Əli");
        salam("Emil", "az");
        salam("John", "en");
    }

    public static void salam() {
        System.out.println("Salam!");
    }

    public static void salam(String ad) {
        System.out.println("Salam, " + ad + "!");
    }

    public static void salam(String ad, String dil) {
        if (dil.equalsIgnoreCase("az")) {
            System.out.println("Salam, " + ad + "!");
        } else if (dil.equalsIgnoreCase("en")) {
            System.out.println("Hello, " + ad + "!");
        } else {
            System.out.println("Salam, " + ad + "!");
        }
    }
}