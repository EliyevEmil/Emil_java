package lesson72;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== StringBuilder və StringBuffer Çalışması ===");
        System.out.println();

        StringBuilder metn = new StringBuilder("Mən proqramlaşdırma öyrənirəm.");
        System.out.println("İlkin mətn: " + metn);

        metn.insert(4, "Java ");
        System.out.println("insert() sonrası: " + metn);

        metn.replace(24, 34, "çox sevirəm");
        System.out.println("replace() sonrası: " + metn);

        metn.delete(20, 24);
        System.out.println("delete() sonrası: " + metn);

        System.out.println("-------------------------------------------------");

        StringBuffer təhlükəsizMətn = new StringBuffer("Mənim yaşım 12.");
        təhlükəsizMətn.append(" Java öyrənmək maraqlıdır!");

        System.out.println("StringBuffer nəticəsi: " + təhlükəsizMətn);
        System.out.println("=================================================");
    }
}