package lesson98;

public class Main6 {
    public static void main(String[] args) {
        int eded = 100;
        int cem = 0;
        int say = 0;

        while (eded <= 300) {
            if (eded % 3 == 0 && eded % 7 == 0) {
                cem += eded;
                say++;
            }
            eded++;
        }

        if (say > 0) {
            double edediOrta = (double) cem / say;
            System.out.println("Həm 3-ə, həm 7-yə bölünən ədədlərin ədədi ortası: " + edediOrta);
        } else {
            System.out.println("Uyğun ədəd tapılmadı.");
        }
    }
}