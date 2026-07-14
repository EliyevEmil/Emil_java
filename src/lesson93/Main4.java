package lesson93;

public class Main4 {
    public static void main(String[] args) {
        yasYoxla(8);
        yasYoxla(15);
        yasYoxla(25);
        yasYoxla(70);
    }

    public static void yasYoxla(int yas) {
        if (yas >= 0 && yas <= 12) {
            System.out.println(yas + " yaş: Uşaqdır");
        } else if (yas >= 13 && yas <= 17) {
            System.out.println(yas + " yaş: Yeniyetmədir");
        } else if (yas >= 18 && yas <= 64) {
            System.out.println(yas + " yaş: Böyükdür");
        } else if (yas >= 65) {
            System.out.println(yas + " yaş: Yaşlıdır");
        } else {
            System.out.println("Yanlış yaş daxil edilib!");
        }
    }
}