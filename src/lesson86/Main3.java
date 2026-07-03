package lesson86;

class Person {
    String ad;
    int yas;

    public void tanisOl() {
        System.out.println("Salam, mənim adım " + ad + ", " + yas + " yaşım var.");
    }
}

public class Main3 {
    public static void main(String[] args) {

        Person insan1 = new Person();
        insan1.ad = "Emil";
        insan1.yas = 12;

        Person insan2 = new Person();
        insan2.ad = "Murad";
        insan2.yas = 15;

        System.out.println("Obyektlər işə düşür:");
        insan1.tanisOl();
        insan2.tanisOl();

    }
}