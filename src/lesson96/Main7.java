package lesson96;

public class Main7 {

    public static void main(String[] args) {
        tersCevir("Java");
    }

    public static void tersCevir(String soz) {
        if (soz.isEmpty()) {
            return;
        }
        System.out.print(soz.charAt(soz.length() - 1));
        tersCevir(soz.substring(0, soz.length() - 1));
    }
}