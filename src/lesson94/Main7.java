package lesson94;

public class Main7 {
    public static void main(String[] args) {
        System.out.println("Sifre123: " + sifreYoxla("Sifre123"));
        System.out.println("Az8: " + sifreYoxla("Az8"));
        System.out.println("Sifremiz: " + sifreYoxla("Sifremiz"));
    }

    public static boolean sifreYoxla(String sifre) {
        if (sifre == null || sifre.length() < 8) {
            return false;
        }

        for (int i = 0; i < sifre.length(); i++) {
            if (Character.isDigit(sifre.charAt(i))) {
                return true;
            }
        }

        return false;
    }
}