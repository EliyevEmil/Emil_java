package lesson71;

public class Main {
    public static void main(String[] args) {

        String adim = "Emil";
        int yasim = 12;

        System.out.println("=== Çoxsətirli Mətn Çalışması ===");
        System.out.println();

        String təqdimatMətni = """
                Salam! Mən Java proqramlaşdırma dilini öyrənirəm.
                Bu çalışma çoxsətirli mətnləri səliqəli çıxarmaq üçündür.
                Məqsədimiz kodun oxunaqlı və nizamlı olmasıdır.
                """;

        System.out.println(təqdimatMətni);

        System.out.println("---------------------------------");

        System.out.print("Şagird məlumatları:\n");
        System.out.print("Ad: " + adim + "\n");
        System.out.print("Yaş: " + yasim + "\n");
        System.out.print("Status: Tapşırıq uğurla tamamlandı!\n");

        System.out.println("=================================");
    }
}