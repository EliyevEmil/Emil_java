package lesson88;

public class Main {

    static class Person {
        String ad;
        String soyad;
        int yas;

        Person(String ad, String soyad, int yas) {
            this.ad = ad;
            this.soyad = soyad;
            this.yas = yas;
        }

        void tanisliq() {
            System.out.println("Salam, mənim adım " + ad + " " + soyad + ". " + yas + " yaşım var.");
        }
    }

    public static void main(String[] args) {
        Person p1 = new Person("Emil", "Məmmədov", 12);
        Person p2 = new Person("Leyla", "Həsənova", 14);

        p1.tanisliq();
        p2.tanisliq();
    }
}