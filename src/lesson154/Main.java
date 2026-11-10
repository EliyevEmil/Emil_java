package lesson154;

public class Main {
    public static void main(String[] args) {
        ProductService service = new ProductService();

        service.create("Laptop", 1400.00, 4);
        service.create("Mouse", 25.50, 50);
        service.create("Keyboard", 45.00, 20);
        service.create("Monitor", 300.00, 10);

        System.out.println("Ümumi məhsul sayı: " + service.getTotalCount());

        service.update(2, "Gaming Mouse", 35.00, 45);

        System.out.println("\nMəhsulların siyahısı:");
        for (Product p : service.findAll()) {
            System.out.println("ID: " + p.getId() +
                    " | Ad: " + p.getName() +
                    " | Qiymət: " + p.getPrice() + " AZN" +
                    " | Miqdar: " + p.getQuantity());
        }
    }
}