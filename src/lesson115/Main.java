package lesson115;

public class Main {
    public static void main(String[] args) {
        Electronics komputer = new Electronics();
        komputer.price = 1000.0;
        System.out.println("Elektronika məhsulunun endirimli qiyməti: " + komputer.getDiscountedPrice());

        Clothing koynek = new Clothing();
        koynek.price = 1000.0;
        System.out.println("Geyim məhsulunun endirimli qiyməti: " + koynek.getDiscountedPrice());
    }
}