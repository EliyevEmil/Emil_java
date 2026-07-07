package lesson89;

public class Main3 {
    public static void main(String[] args) {
        Phone telefon1 = new Phone("iPhone");
        Phone telefon2 = new Phone("Samsung", 1800);

        telefon1.melumatiGoster();
        telefon2.melumatiGoster();
    }
}

class Phone {
    String brand;
    double price;

    public Phone(String telefonBrendi) {
        brand = telefonBrendi;
    }

    public Phone(String telefonBrendi, double telefonQiymeti) {
        brand = telefonBrendi;
        price = telefonQiymeti;
    }

    public void melumatiGoster() {
        System.out.println("Telefonun brendi: " + brand + ", Qiyməti: " + price + " AZN");
    }
}