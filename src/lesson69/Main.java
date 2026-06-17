package lesson69;

public class Main {
    public static void main(String[] args) {

        String adim = "Emil";
        int yasim = 12;
        String mektebim = "Bakı şəhəri tam orta məktəbi";
        double riyaziyyatQiymətim = 4.8;

        System.out.println("Salam, mən özüm haqqında məlumatları təqdim edirəm:");
        System.out.println("-------------------------------------------------");

        System.out.printf("Mənim adım %s-dir.%n", adim);
        System.out.printf("Mənim %d yaşım var.%n", yasim);
        System.out.printf("Mən %s-ndə oxuyuram.%n", mektebim);
        System.out.printf("Riyaziyyat fənnindən ortalama qiymətim: %.1f-dir.%n", riyaziyyatQiymətim);

        System.out.println("-------------------------------------------------");
    }
}