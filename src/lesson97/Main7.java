package lesson97;

public class Main7 {

    static class Telebe {
        String ad;
        int yas;

        Telebe(String ad, int yas) {
            this.ad = ad;
            this.yas = yas;
        }
    }

    static void testInt(int x) {
        x = 100;
    }

    static void testArrayElement(int[] arr) {
        arr[0] = 999;
    }

    static void testArrayNull(int[] arr) {
        arr = null;
    }

    static void testString(String s) {
        s = "Yeni dəyər";
    }

    static void testObjectField(Telebe t) {
        t.yas = t.yas + 1;
    }

    static void testObjectNull(Telebe t) {
        t = null;
    }

    public static void main(String[] args) {
        System.out.println("--- 1) int göndərmə ---");
        int a = 5;
        System.out.println("ƏVVƏL: a = " + a);
        testInt(a);
        System.out.println("SONRA: a = " + a);

        System.out.println("\n--- 2) int[] göndərmə ---");
        int[] ededler = {1, 2, 3};
        System.out.println("ƏVVƏL: ededler[0] = " + ededler[0]);
        testArrayElement(ededler);
        System.out.println("SONRA: ededler[0] = " + ededler[0]);

        System.out.println("\n--- 3) int[] referansını null etmə ---");
        int[] data = {10, 20, 30};
        System.out.println("ƏVVƏL: data is null? " + (data == null));
        testArrayNull(data);
        System.out.println("SONRA: data is null? " + (data == null));

        System.out.println("\n--- 4) String göndərmə ---");
        String soz = "Kohne";
        System.out.println("ƏVVƏL: soz = " + soz);
        testString(soz);
        System.out.println("SONRA: soz = " + soz);

        System.out.println("\n--- 5) Obyekt göndərmə ---");
        Telebe telebe1 = new Telebe("Ali", 20);
        System.out.println("ƏVVƏL: telebe1.yas = " + telebe1.yas);
        testObjectField(telebe1);
        System.out.println("SONRA: telebe1.yas = " + telebe1.yas);

        System.out.println("\n--- 6) Obyekt referansını null etmə ---");
        Telebe telebe2 = new Telebe("Veli", 22);
        System.out.println("ƏVVƏL: telebe2 is null? " + (telebe2 == null));
        testObjectNull(telebe2);
        System.out.println("SONRA: telebe2 is null? " + (telebe2 == null));

        System.out.println("\nNƏTİCƏ:");
        System.out.println("Java-da həmişə pass-by-value işləyir.");
        System.out.println("Primitive-lərdə dəyərin kopyası,");
        System.out.println("obyektlərdə referansın kopyası göndərilir.");
    }
}