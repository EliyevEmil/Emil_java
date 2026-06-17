package lesson70;

public class Main {
    public static void main(String[] args) {

        String adim = "Emil";
        int yasim = 12;
        String mektebim = "Bakı şəhəri tam orta məktəbi";
        double riyaziyyatQiymətim = 4.8;

        System.out.println("--- Mətn Generatoru (Escape ilə) ---");

        System.out.println("Mənim adım \" " + adim + " \" dur.");
        System.out.println("Yaşım: " + yasim + "\nFənn: \"Riyaziyyat\"");
        System.out.println("Məktəb: \'" + mektebim + "\'");
        System.out.println("Ortalama balım:\t" + riyaziyyatQiymətim);

        System.out.println("------------------------------------");
    }
}