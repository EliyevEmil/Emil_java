package lesson89;

public class Main {
    public static void main(String[] args) {
        ConstructorBook menimKitabim = new ConstructorBook("Harri Potter", 15.50);
        menimKitabim.melumatiGoster();
    }
}

class ConstructorBook {
    String name;
    double price;

    public ConstructorBook(String kitabAdi, double kitabQiymeti) {
        name = kitabAdi;
        price = kitabQiymeti;
    }

    public void melumatiGoster() {
        System.out.println("Kitabın adı: " + name);
        System.out.println("Qiyməti: " + price + " AZN");
    }
}